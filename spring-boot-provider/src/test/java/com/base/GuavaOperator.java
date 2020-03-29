package com.base;

import com.example.util.CollectionUtil;
import com.google.common.base.*;
import com.google.common.collect.Collections2;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 字符串操作
 *
 * @author tuzhijin
 * @version Id: StrOperator.java, v 0.1 2020/3/27 23:20 tuzhijin Exp $$
 */
public class GuavaOperator {

    public static void main(String[] args) {

//        format();
//        List list = Lists.newArrayList("1",null,"2","","3");
//        System.out.println(strJoin(list));
//        System.out.println(strSplit("1,2,,3"));
//        charMatcher();
//        mapToStr();
//        strToMap();
        isEmpty("2");

    }

    public static void isEmpty(String str) {
        if (!Strings.isNullOrEmpty(str)) {
            System.out.println("不为null或者空");
        } else {
            System.out.println("为空或者null");
        }
    }

    /**
     * str->Map
     */
    public static void strToMap() {
        String str = "xiaoming=11,xiaohong=23";
        Map<String, String> map = Splitter.on(",").withKeyValueSeparator("=").split(str);
        System.out.println(map.toString());
    }

    /**
     * map->String
     */
    public static void mapToStr() {
        Map<String, Integer> map = Maps.newHashMap();
        map.put("xiaoming", 12);
        map.put("xiaohong", 13);
        String result = Joiner.on("&").withKeyValueSeparator("=").join(map);
        System.out.println(result);
    }

    /**
     * 字符匹配
     *
     * @return
     */
    public static void charMatcher() {
        System.out.println(CharMatcher.DIGIT.retainFrom("mahesh123")); // only the digits
        System.out.println(CharMatcher.WHITESPACE.trimAndCollapseFrom("     Mahesh     Parashar ", ' '));
        System.out.println(CharMatcher.JAVA_DIGIT.replaceFrom("mahesh123", "*")); // star out all digits
        System.out.println(CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LOWER_CASE).retainFrom("mahesh123"));

    }

    /**
     * 字符格式转换
     */
    public static void format() {
        System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, "test-data"));//testData
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "test_data"));//testData
        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "test_data"));//TestData

        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "testdata"));//testdata
        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "TestData"));//test_data
        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, "testData"));//test-data
    }

    /**
     * 集合转字符串
     *
     * @param list
     * @return
     */
    public static String strJoin(List list) {
        return Joiner.on(",").skipNulls().join(list);
    }

    /**
     * 字符串转集合
     *
     * @param string
     * @return
     */
    public static List<String> strSplit(String string) {
        String input = "aa.dd,,ff,,.";
        List<String> result = Splitter.onPattern("[.|,]").omitEmptyStrings().splitToList(input);
        System.out.println(result);
        String str = "1-2-3-4-  5-  6   ";
        // omitEmptyStrings().trimResults() 去除空串与空格
        List<String> list = Splitter.on("-").omitEmptyStrings().trimResults().splitToList(str);
        System.out.println(list);
        return Splitter.on(",").splitToList(string);
    }

}
