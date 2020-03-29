package com.base;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

/**
 * @author tuzhijin
 * @version Id: IOOperator.java, v 0.1 2020/3/29 16:33 tuzhijin Exp $$
 */
public class IOOperator {

    public static void main(String[] args) {

        fileNameOperator();
    }

    /**
     * 文件名操作
     */
    public static void fileNameOperator() {

        String fileName = "1.jpg";
        System.out.println(FilenameUtils.getExtension(fileName)); //jpg
        System.out.println(FilenameUtils.getBaseName(fileName));  //1
//        System.out.println(FilenameUtils.getPrefix(fileName));
    }

    /**
     * 文件操作
     */
    public static void fileOperator() {

//        FileUtils
    }

    /**
     * io操作
     */
    public static void ioOperator() {

//        IOUtils
    }
}
