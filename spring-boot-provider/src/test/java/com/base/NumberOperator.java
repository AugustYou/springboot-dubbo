package com.base;


import java.math.BigDecimal;

/**
 * @author tuzhijin
 * @version Id: NumberOperator.java, v 0.1 2020/3/27 23:16 tuzhijin Exp $$
 */
public class NumberOperator {

    public static void main(String[] args) {
        // null会报np
        System.out.println(compare("5", "10"));
    }

    /**
     *
     * @param str1
     * @param st2
     * @return
     */
    public static Boolean compare(String str1, String st2){
        return new BigDecimal(str1).compareTo(new BigDecimal(st2))>0;
    }
}
