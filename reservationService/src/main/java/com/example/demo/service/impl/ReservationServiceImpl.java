package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.common.util.HospitalUtil;
import com.example.demo.entity.domain.Reservation;
import com.example.demo.entity.query.ReservationQuery;
import com.example.demo.service.ReservationService;
import com.example.demo.mapper.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author h
* @description 针对表【tb_reservation】的数据库操作Service实现
* @createDate 2023-11-28 20:41:29
*/
@Service
public class ReservationServiceImpl extends ServiceImpl<ReservationMapper, Reservation> implements ReservationService{
    @Autowired
    private ReservationMapper reservationMapper;
    @Override
    public Page<Reservation> selectPage(ReservationQuery reservationQuery) {
        if (reservationQuery == null) {
            reservationQuery = new ReservationQuery();
        }
        //设置分页信息
        Page<Reservation> page = Page.of(reservationQuery.getPageNum(),reservationQuery.getPageSize());
        QueryWrapper<Reservation> queryWrapper = HospitalUtil.generateQueryWrapper(reservationQuery);
        //查询数据
        Page<Reservation> reservationPage = reservationMapper.selectPage(page, queryWrapper);
        return reservationPage;
    }
    @Override
    public boolean conflictDetection(Reservation reservation){
        ReservationQuery reservationQuery = new ReservationQuery();
        reservationQuery.setPatientId(reservation.getPatientId());
        reservationQuery.setReservationTime(reservation.getReservationTime());
        reservationQuery.setTimeId(reservation.getTimeId());
        reservationQuery.setState(reservation.getState());
        int size = selectPage(reservationQuery).getRecords().size();
        if(size>0){
            return false;//发生冲突
        }
        return true;
    }
}




