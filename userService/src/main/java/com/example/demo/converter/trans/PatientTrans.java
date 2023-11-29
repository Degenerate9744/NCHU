package com.example.demo.converter.trans;

import com.example.demo.common.util.TransUtil;
import com.example.demo.converter.PatientConverter;
import com.example.demo.entity.domain.Patient;
import com.example.demo.entity.domain.PatientType;
import com.example.demo.entity.vo.PatientVO;
import com.example.demo.service.PatientTypeService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName：PatientTrans
 * @Author：Acmsdy
 * @Date：2023-11-29 21:00
 * @Describe：
 */
@Component
public class PatientTrans {
    @Autowired
    private PatientTypeService patientTypeService;
    @Autowired
    private PatientConverter patientConverter;

    @Getter
    private TransUtil<Patient, PatientVO> instance = new TransUtil<>() {
        @Override
        public PatientVO tObj2VObj(Patient patient) {
            PatientVO patientVO = patientConverter.toPatientVO(patient);
            final PatientType patientType = patientTypeService.getById(patient.getPatientTypeId());
            patientVO.setPatientTypeName(patientType.getPatientTypeName());
            return patientVO;
        }
    };
}
