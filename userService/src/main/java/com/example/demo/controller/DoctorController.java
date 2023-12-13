package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.bean.PageBean;
import com.example.demo.converter.trans.DoctorTrans;
import com.example.demo.entity.domain.Doctor;
import com.example.demo.entity.domain.Doctor;
import com.example.demo.entity.domain.DoctorLevel;
import com.example.demo.entity.query.DoctorQuery;
import com.example.demo.entity.vo.DoctorVO;
import com.example.demo.service.DoctorLevelService;
import com.example.demo.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName：StaffController
 * @Author：Acmsdy
 * @Date：2023-11-28 10:30
 * @Describe：
 */
@EnableDiscoveryClient
@Controller
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private DoctorLevelService doctorLevelService;
    @Autowired
    private DoctorTrans doctorTrans;

    @ResponseBody
    @RequestMapping("/list")
    public PageBean<DoctorVO> list(DoctorQuery doctorQuery){
        if (doctorQuery.getDoctorLevelName()!=null){
            QueryWrapper<DoctorLevel> queryWrapper = new QueryWrapper<>();
            queryWrapper.like("doctor_level_name", doctorQuery.getDoctorLevelName());
            List<DoctorLevel> list = doctorLevelService.list(queryWrapper);
            doctorQuery.setDoctorLevelId(list.get(0).getDoctorLevelId());
            doctorQuery.setDoctorLevelName(null);
        }
        Page<Doctor> doctorPage = doctorService.selectPage(doctorQuery);
        PageBean<DoctorVO> doctorVOPageBean = doctorTrans.getInstance().tPage2VPageBean(doctorPage);
        return doctorVOPageBean;
    }
    @ResponseBody
    @RequestMapping("/insert")
    public boolean insert(Doctor doctor){
        return doctorService.save(doctor);
    }
    @ResponseBody
    @RequestMapping("/delete")
    public boolean delete(String id){
        return doctorService.removeById(id);
    }
    @ResponseBody
    @RequestMapping("/update")
    public boolean update(Doctor doctor){
        return doctorService.updateById(doctor);
    }

    @ResponseBody
    @RequestMapping("/select")
    public String selectNameById(String doctorId){
        doctorId = "1";
        return doctorService.getById(doctorId).getDoctorName();
    }
}
