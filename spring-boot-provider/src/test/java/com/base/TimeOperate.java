package com.base;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Date;

/**
 * 时间操作
 *
 * @author tuzhijin
 * @version Id: com.base.Test.java, v 0.1 2019/6/3 7:32 tuzhijin Exp $$
 */
public class TimeOperate {

    public static void main(String[] args) throws ParseException {
//        System.out.println(DateFormatUtils.format(addDay(1), "yyyy-MM-dd"));
        compare();
    }


    /**
     * 日期加day天
     *
     * @param day
     * @return
     */
    public static Date addDay(int day) {
        return DateUtils.addDays(new Date(), day);
    }

    /**
     * 日期时间比较大小
     *
     * @throws ParseException
     */
    public static void compare() throws ParseException {
        System.out.println(new Date().after(DateUtils.parseDate("2020-03-27 23:15:55", "yyyy-MM-dd HH:mm:ss")));
    }
}
