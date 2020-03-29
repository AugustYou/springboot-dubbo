package com.base;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * @author tuzhijin
 * @version Id: Lang3Operator.java, v 0.1 2020/3/29 15:50 tuzhijin Exp $$
 */
public class Lang3Operator {

    public static void main(String[] args) {
//        strSubString();
        // 生成随机字符
//        final String random = RandomStringUtils.random(3, "qwertyuiop");
//        System.out.println(random);

//        final long l = NumberUtils.toLong("233");
//        System.out.println(l);

//        final byte[] bytes = DigestUtils.md5("233");
//        System.out.println(bytes);

    }

    /**
     * 字符串截取
     */
    private static void strSubString() {
        String pic = "1.jpg";
        pic = null;
        System.out.println(StringUtils.substringAfter(pic, "."));
        System.out.println(StringUtils.substringAfterLast(pic, "."));
        System.out.println(StringUtils.substringBefore(pic, "."));
        System.out.println(StringUtils.substringBeforeLast(pic, "."));
    }


    /**
     * 字符串替换
     */
    public static void replace() {
        System.out.println(StringUtils.replace("aba", "a", "")); //  "b"
        System.out.println(StringUtils.replace("aba", "a", "z")); // "zbz"

    }
}
