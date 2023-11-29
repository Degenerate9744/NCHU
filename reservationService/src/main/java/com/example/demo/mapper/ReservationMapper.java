package com.example.demo.mapper;

import com.example.demo.entity.domain.Reservation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author h
* @description 针对表【tb_reservation】的数据库操作Mapper
* @createDate 2023-11-28 20:41:29
* @Entity com.example.demo.entity.domain.Reservation
*/
@Mapper
public interface ReservationMapper extends BaseMapper<Reservation> {

}




