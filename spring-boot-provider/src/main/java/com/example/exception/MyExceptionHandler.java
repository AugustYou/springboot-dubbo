package com.example.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author tuzhijin
 * @version Id: MyExceptionHandler.java, v 0.1 2020/3/28 21:44 tuzhijin Exp $$
 */
@ControllerAdvice
@Slf4j
public class MyExceptionHandler {

    @ExceptionHandler(value =Exception.class)
    public String exceptionHandler(Exception e){
        log.info("未知异常！原因是:{}", e);
        return e.getMessage();
    }

}
