package com.safay.IO;

import java.io.FileReader;
import java.io.IOException;

/**
 * Author: wqf
 * Date: 2020/2/18
 * Time: 23:49
 */
public class DemoReader {

  public static void main(String[] args) {
    try {
      FileReader fr = new FileReader("D:\\a.txt");
      int len = 0;
      //按照字符来读取，因此不会出现读不出中文（一个中文2个byte）
      while ((len = fr.read()) != -1){
        System.out.println((char) len);
      }
      fr.close();
      fr = new FileReader("D:\\a.txt");
      char[] cs = new char[1024];
      while ((len = fr.read(cs)) != -1){
        System.out.print(new String(cs));
      }
      fr.close();
    }catch (IOException e){
      e.printStackTrace();
    }
  }
}
