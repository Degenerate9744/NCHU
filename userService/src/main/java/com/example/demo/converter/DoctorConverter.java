package com.example.demo.converter;

import com.example.demo.entity.domain.Doctor;
import com.example.demo.entity.vo.DoctorVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

/**
 * @ClassName：DoctorConverter
 * @Author：Acmsdy
 * @Date：2023-11-29 16:57
 * @Describe：
 */
@Mapper(componentModel = "spring")
@Component
public interface DoctorConverter {
    DoctorVO toDoctorVO(Doctor doctor);
}
