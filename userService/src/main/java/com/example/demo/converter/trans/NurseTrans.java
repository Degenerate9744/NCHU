package com.example.demo.converter.trans;

import com.example.demo.common.util.TransUtil;
import com.example.demo.converter.NurseConverter;
import com.example.demo.entity.domain.Nurse;
import com.example.demo.entity.domain.NurseLevel;
import com.example.demo.entity.vo.NurseVO;
import com.example.demo.service.NurseLevelService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName：NurseTrans
 * @Author：Acmsdy
 * @Date：2023-11-29 20:38
 * @Describe：
 */
@Component
public class NurseTrans {
    @Autowired
    private NurseLevelService nurseLevelService;
    @Autowired
    private NurseConverter nurseConverter;

    @Getter
    private TransUtil<Nurse, NurseVO> instance = new TransUtil<>() {
        @Override
        public NurseVO tObj2VObj(Nurse nurse) {
            NurseVO nurseVO = nurseConverter.toNurseVO(nurse);
            final NurseLevel nurseLevel = nurseLevelService.getById(nurse.getNurseLevelId());
            nurseVO.setNurseLevelName(nurseLevel.getNurseLevelName());
            return nurseVO;
        }
    };
}
