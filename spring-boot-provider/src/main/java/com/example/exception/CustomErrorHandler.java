package com.example.exception;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

/**
 * @author tuzhijin
 * @version Id: ThrowErrorHandler.java, v 0.1 2020/3/29 00:39 tuzhijin Exp $$
 */
public class CustomErrorHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        //返回false表示不管response的status是多少都返回没有错
        //这里可以自己定义那些status code你认为是可以抛Error
        return true;
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        //这里面可以实现你自己遇到了Error进行合理的处理

    }
}
