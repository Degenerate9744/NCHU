package com.example.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.domain.Reservation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.query.ReservationQuery;

/**
* @author h
* @description 针对表【tb_reservation】的数据库操作Service
* @createDate 2023-11-28 20:41:29
*/
public interface ReservationService extends IService<Reservation> {
    public Page<Reservation> selectPage(ReservationQuery reservationQuery);
    public boolean conflictDetection(Reservation reservation);
}
