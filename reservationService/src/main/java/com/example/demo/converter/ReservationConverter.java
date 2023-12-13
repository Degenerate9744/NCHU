package com.example.demo.converter;

import com.example.demo.entity.domain.Reservation;
import com.example.demo.entity.vo.ReservationVO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

/**
 * @ClassName：ReservationConverter
 * @Author：Acmsdy
 * @Date：2023-12-12 9:07
 * @Describe：
 */
@Mapper(componentModel = "spring")
@Component
public interface ReservationConverter {
    ReservationVO toReservationVO(Reservation reservation);
}
