package com.example.demo.converter;

import com.example.demo.entity.domain.Nurse;
import com.example.demo.entity.domain.Patient;
import com.example.demo.entity.vo.NurseVO;
import com.example.demo.entity.vo.PatientVO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

/**
 * @ClassName：PatientConverter
 * @Author：Acmsdy
 * @Date：2023-11-29 20:59
 * @Describe：
 */
@Mapper(componentModel = "spring")
@Component
public interface PatientConverter {
    PatientVO toPatientVO(Patient patient);
}
