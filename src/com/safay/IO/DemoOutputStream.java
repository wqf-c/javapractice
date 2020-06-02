package com.safay.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Author: wqf
 * Date: 2020/2/18
 * Time: 1:32
 */
public class DemoOutputStream {

  public static void main(String[] args) {
    OutputStream fos = null;
    OutputStream fos1 = null;
    try {
      fos = new FileOutputStream("D:\\a.txt");
      fos.write(94);
      fos.write(new byte[]{-20, -10});
      fos.close();
      //追加写
      fos1 = new FileOutputStream("D:\\a.txt", true);
      fos.write(99);
      fos.write("\r\n".getBytes());
      fos.write("你好".getBytes());
      fos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
