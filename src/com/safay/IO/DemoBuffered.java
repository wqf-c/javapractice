package com.safay.IO;

import java.io.*;

/**
 * Author: wqf
 * Date: 2020/2/19
 * Time: 0:49
 */
public class DemoBuffered {

  public static void main(String[] args) {
    try {
      BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\a.txt"));
      bos.write(10);
      bos.flush();
      bos.close();
      BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\a.txt"));
      int len = bis.read();
      System.out.println(len);
      bis.close();
      BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));
      String s = br.readLine();
      br.close();
      BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\a.txt"));
      bw.close();
    }catch (Exception e){
      e.printStackTrace();
    }
  }
}
