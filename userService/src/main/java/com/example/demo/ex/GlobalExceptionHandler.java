package com.example.demo.ex;

/**
 * @ClassName：GlobalExceptionHandler
 * @Author：Acmsdy
 * @Date：2023-11-28 15:14
 * @Describe：
 */
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        // 在这里可以执行异常处理操作，比如记录日志
        // 返回自定义错误响应和对应的HTTP状态码
        return new ResponseEntity<>("An error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

