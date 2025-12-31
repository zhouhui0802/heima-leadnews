package com.zh.heima.utils.common;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2025/12/31 15:22
 */
public class FileUtils {
    /**
     * 重资源流中读取第一行内容
     * @param in
     * @return
     * @throws IOException
     */
    public static String readFristLineFormResource(InputStream in) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(in));
        return br.readLine();
    }
}
