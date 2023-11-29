package com.example.demo.converter.trans;

import com.example.demo.common.util.TransUtil;
import com.example.demo.converter.DoctorConverter;
import com.example.demo.entity.domain.Doctor;
import com.example.demo.entity.domain.DoctorLevel;
import com.example.demo.entity.vo.DoctorVO;
import com.example.demo.service.DoctorLevelService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName：DoctorTrans
 * @Author：Acmsdy
 * @Date：2023-11-29 16:56
 * @Describe：
 */
@Component
public class DoctorTrans {
    @Autowired
    private DoctorLevelService doctorLevelService;
    @Autowired
    private DoctorConverter doctorConverter;

    @Getter
    private TransUtil<Doctor, DoctorVO> instance = new TransUtil<>() {
        @Override
        public DoctorVO tObj2VObj(Doctor doctor) {
            DoctorVO doctorVO = doctorConverter.toDoctorVO(doctor);
            final DoctorLevel doctorLevel = doctorLevelService.getById(doctor.getDoctorLevelId());
            doctorVO.setDoctorLevelName(doctorLevel.getDoctorLevelName());
            return doctorVO;
        }
    };
}
