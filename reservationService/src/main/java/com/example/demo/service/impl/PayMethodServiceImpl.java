package com.example.demo.service.impl;

import com.example.demo.service.PayMethodService;
import org.springframework.stereotype.Service;

/**
 * @ClassName：PayMethodServiceImpl
 * @Author：Acmsdy
 * @Date：2023-12-13 8:47
 * @Describe：
 */
@Service
public class PayMethodServiceImpl implements PayMethodService {
    @Override
    public boolean AliPay(String reservationId) {
        return true;
    }

    @Override
    public boolean WeChatPay(String reservationId) {
        return true;
    }
}
