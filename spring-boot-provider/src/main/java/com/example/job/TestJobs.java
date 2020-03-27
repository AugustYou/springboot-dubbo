package com.example.job;

import com.example.util.AsyncTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author tuzhijin
 * @version Id: TestJobs.java, v 0.1 2019/6/12 19:03 tuzhijin Exp $$
 */
@Component
public class TestJobs {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AsyncTask asyncTask;

    @Async("myTaskAsyncPool")  //myTaskAsynPool即配置线程池的方法名，此处如果不写自定义线程池的方法名，会使用默认的线程池
//    @Scheduled(cron = "0 8 * * * *")
    public void doTask2() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            asyncTask.doTask1(i);
        }
    }
}
