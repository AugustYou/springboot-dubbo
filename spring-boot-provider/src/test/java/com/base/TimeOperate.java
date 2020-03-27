package com.base;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

/**
 * @author tuzhijin
 * @version Id: com.base.Test.java, v 0.1 2019/6/3 7:32 tuzhijin Exp $$
 */
public class TimeOperate {

    public static void main(String[] args) {
        System.out.println(DateFormatUtils.format(addDay(1), "yyyy-MM-dd"));
    }


    public static Date addDay(int day) {
        return DateUtils.addDays(new Date(), day);
    }
}
