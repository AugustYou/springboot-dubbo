package com.example.exception;

/**
 * @author tuzhijin
 * @version Id: BaseErrorInfoInterface.java, v 0.1 2020/3/28 21:45 tuzhijin Exp $$
 */
public interface BaseErrorInfoInterface {

    /** 错误码*/
    String getResultCode();

    /** 错误描述*/
    String getResultMsg();

}
