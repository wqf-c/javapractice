package com.safay.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author: wqf
 * Date: 2020/2/18
 * Time: 23:26
 */
public class DemoCopyFile {
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("D:\\a.txt");
      FileOutputStream fos = new FileOutputStream("D:\\b.txt");
      int len = 0;
      byte[] bytes = new byte[2];
      while ((len = fis.read(bytes)) != -1){
        fos.write(bytes);
      }
      fis.close();
      fos.close();
    }catch (IOException e){
      e.printStackTrace();
    }

  }
}
