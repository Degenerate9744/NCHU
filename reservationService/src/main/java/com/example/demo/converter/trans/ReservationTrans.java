package com.example.demo.converter.trans;

import com.example.demo.common.util.TransUtil;
import com.example.demo.converter.ReservationConverter;
import com.example.demo.entity.domain.Reservation;
import com.example.demo.entity.domain.Time;
import com.example.demo.entity.vo.ReservationVO;
import com.example.demo.feign.UserServiceFeign;
import com.example.demo.service.TimeService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName：ReservationTrans
 * @Author：Acmsdy
 * @Date：2023-12-12 9:07
 * @Describe：
 */
@Component
public class ReservationTrans {
    @Autowired
    private UserServiceFeign userServiceFeign;
    @Autowired
    private TimeService timeService;
    @Autowired
    private ReservationConverter reservationConverter;

    @Getter
    private TransUtil<Reservation, ReservationVO> instance = new TransUtil<>() {
        @Override
        public ReservationVO tObj2VObj(Reservation reservation) {
            ReservationVO reservationVO = reservationConverter.toReservationVO(reservation);
            Time time = timeService.getById(reservation.getTimeId());
            reservationVO.setStartTime(time.getStartTime());
            reservationVO.setEndTime(time.getEndTime());
            reservationVO.setDoctorName(userServiceFeign.doctorNameSelectById(reservation.getDoctorId()));
            reservationVO.setPatientName(userServiceFeign.patientNameSelectById(reservation.getPatientId()));
            return reservationVO;
        }
    };
}
