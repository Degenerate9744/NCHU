package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.bean.PageBean;
import com.example.demo.converter.trans.PatientTrans;
import com.example.demo.entity.domain.Patient;
import com.example.demo.entity.query.PatientQuery;
import com.example.demo.entity.vo.NurseVO;
import com.example.demo.entity.vo.PatientVO;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName：PatientController
 * @Author：Acmsdy
 * @Date：2023-11-27 9:08
 * @Describe：
 */
@EnableDiscoveryClient
@Controller
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @Autowired
    private PatientTrans patientTrans;

    @ResponseBody
    @RequestMapping("/list")
    public PageBean<PatientVO> list(PatientQuery patientQuery){
        Page<Patient> patientPage = patientService.selectPage(patientQuery);
        PageBean<PatientVO> patientVOPageBean = patientTrans.getInstance().tPage2VPageBean(patientPage);
        return patientVOPageBean;
    }
    @ResponseBody
    @RequestMapping("/insert")
    public boolean insert(Patient patient){
        return patientService.save(patient);
    }
    @ResponseBody
    @RequestMapping("/delete")
    public boolean delete(String id){
        return patientService.removeById(id);
    }
    @ResponseBody
    @RequestMapping("/update")
    public boolean update(Patient patient){
        return patientService.updateById(patient);
    }
    @ResponseBody
    @RequestMapping("/select")
    public String selectNameById(String patientId){
        patientId = "1";
        return patientService.getById(patientId).getPatientName();
    }
}
