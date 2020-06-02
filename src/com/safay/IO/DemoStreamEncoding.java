package com.safay.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * Author: wqf
 * Date: 2020/2/19
 * Time: 1:04
 */
public class DemoStreamEncoding {
  public static void main(String[] args) {
    try {
      OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\c.txt"), "gbk");
      osw.write("你好");
      osw.close();
      //构造函数指定的编码必须与文件编码相同
      InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\c.txt"), "gbk");
      int len = 0;
      while ((len = isr.read()) != -1){
        System.out.println((char) len);
      }
      isr.close();
    }catch (Exception e){
      e.printStackTrace();
    }
  }
}
