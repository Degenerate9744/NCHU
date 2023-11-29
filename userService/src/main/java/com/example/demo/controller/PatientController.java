package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.domain.Patient;
import com.example.demo.entity.query.PatientQuery;
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


    @ResponseBody
    @RequestMapping("/list")
    public Page<Patient> list(PatientQuery patientQuery){
        Page<Patient> patientPage = patientService.selectPage(patientQuery);
        return patientPage;
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
}
