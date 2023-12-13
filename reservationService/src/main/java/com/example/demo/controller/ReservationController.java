/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.bean.PageBean;
import com.example.demo.converter.trans.ReservationTrans;
import com.example.demo.entity.domain.Reservation;
import com.example.demo.entity.query.ReservationQuery;
import com.example.demo.entity.vo.ReservationVO;
import com.example.demo.service.PayMethodService;
import com.example.demo.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
//@EnableFeignClients(basePackages = {"com.example.demo.feign"})
@EnableDiscoveryClient
@Controller
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    private ReservationTrans reservationTrans;
    @Autowired
    private ReservationService reservationService;
    @Autowired
    private PayMethodService payMethodService;

    @ResponseBody
    @RequestMapping("/list")
    public PageBean<ReservationVO> list(ReservationQuery reservationQuery){
        Page<Reservation> reservationPage = reservationService.selectPage(reservationQuery);
        PageBean<ReservationVO> reservationVOPageBean = reservationTrans.getInstance().tPage2VPageBean(reservationPage);
        return reservationVOPageBean;
    }
    @ResponseBody
    @RequestMapping("/insert")
    public boolean insert(Reservation reservation){
        if (reservationService.conflictDetection(reservation)) {
            return reservationService.save(reservation);
        }
        return false;
    }
    @ResponseBody
    @RequestMapping("/delete")
    public boolean delete(String id){
        return reservationService.removeById(id);
    }
    @ResponseBody
    @RequestMapping("/update")
    public boolean update(Reservation reservation){
        return reservationService.updateById(reservation);
    }
    @ResponseBody
    @RequestMapping("/pay")
    public boolean pay(String option,String reservationId){
        boolean result = false;
        switch (option){
            case "AliPay":result = payMethodService.AliPay(reservationId);break;
            case "WeChatPay":result = payMethodService.WeChatPay(reservationId);break;
        }
        return result;
    }
}
