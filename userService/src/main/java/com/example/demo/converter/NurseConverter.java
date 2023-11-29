package com.example.demo.converter;

import com.example.demo.entity.domain.Nurse;
import com.example.demo.entity.vo.NurseVO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

/**
 * @ClassName：NurseConverter
 * @Author：Acmsdy
 * @Date：2023-11-29 20:38
 * @Describe：
 */
@Mapper(componentModel = "spring")
@Component
public interface NurseConverter {
    NurseVO toNurseVO(Nurse nurse);
}
