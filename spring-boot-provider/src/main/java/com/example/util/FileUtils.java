package com.example.util;

import java.io.File;

/**
 * @author tuzhijin
 * @version Id: FileUtils.java, v 0.1 2019/7/25 21:09 tuzhijin Exp $$
 */
public class FileUtils {

    public static void main(String args[]) {

        System.out.println("file Go...");
        // 这里改成你要遍历的目录路径
        recursiveFiles("D:\\360安全浏览器下载");
        System.out.println("file End.");

    }

    /**
     * Xiwi
     * 遍历文件/文件夹 - 函数
     * [String]path        文件路径
     */
    private static void recursiveFiles(String path) {

        // 创建 File对象
        File file = new File(path);
        // 取 文件/文件夹
        File files[] = file.listFiles();
        // 对象为空 直接返回
        if (files == null) {
            return;
        }

        // 目录下文件
        if (files.length == 0) {
            System.out.println(path + "该文件夹下没有文件");
        }

        // 存在文件 遍历 判断
        for (File f : files) {
            // 判断是否为 文件夹
            if (f.isDirectory()) {
                // 为 文件夹继续遍历
                recursiveFiles(f.getAbsolutePath());
                // 判断是否为 文件
            } else if (f.isFile()) {
                System.out.print("文件: ");
                System.out.println(f.getAbsolutePath());
            } else {
                System.out.print("未知错误文件");
            }

        }

    }

}
