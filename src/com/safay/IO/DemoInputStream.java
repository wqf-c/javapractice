package com.safay.IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Author: wqf
 * Date: 2020/2/18
 * Time: 23:17
 */
public class DemoInputStream {

  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("D:\\a.txt");
      int len;
      while ((len = fis.read()) != -1){
        System.out.print((char)len);
      }
      fis.close();
      byte[] bytes = new byte[2];
      fis = new FileInputStream("D:\\a.txt");
      while ((len = fis.read(bytes)) != -1){
        System.out.println("a");
      }
    }catch (IOException e){
      e.printStackTrace();
    }
  }
}
