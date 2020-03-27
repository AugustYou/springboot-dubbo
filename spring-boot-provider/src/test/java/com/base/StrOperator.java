package com.base;

import com.google.common.base.CaseFormat;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.assertj.core.util.Lists;

import java.util.List;

/**
 * @author tuzhijin
 * @version Id: StrOperator.java, v 0.1 2020/3/27 23:20 tuzhijin Exp $$
 */
public class StrOperator {

    public static void main(String[] args) {

//        format();
        List list = Lists.newArrayList("1",null,"2","","3");
        System.out.println(strJoin(list));

        System.out.println(strSplit("1,2,,3"));
    }

    public static void format() {
        System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, "test-data"));//testData
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "test_data"));//testData
        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "test_data"));//TestData

        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "testdata"));//testdata
        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "TestData"));//test_data
        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, "testData"));//test-data
    }

    public static String strJoin(List list){
        return Joiner.on(",").skipNulls().join(list);
    }

    public static List<String> strSplit(String string){
        return Splitter.on(",").splitToList(string);
    }
}
