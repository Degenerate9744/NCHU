package com.example.demo.service;

/**
 * @ClassName：PayMethod
 * @Author：Acmsdy
 * @Date：2023-12-13 8:46
 * @Describe：
 */
public interface PayMethodService {
    public boolean AliPay(String reservationId);
    public boolean WeChatPay(String reservationId);

}
