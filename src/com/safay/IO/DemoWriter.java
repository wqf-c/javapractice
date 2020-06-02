package com.safay.IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Author: wqf
 * Date: 2020/2/18
 * Time: 23:57
 */
public class DemoWriter {
  public static void main(String[] args) {
    FileWriter fw = null;
    try {
      //追加，构造函数传入true
      fw = new FileWriter("D:\\b.txt" /*, true*/);
      fw.write(97);
      fw.flush();
      fw.close();
    }catch (IOException e){
      e.printStackTrace();
    }finally {
      if(fw != null){
        try {
          fw.close();
        }catch (Exception e){
          e.printStackTrace();
        }
      }
    }
  }
}
