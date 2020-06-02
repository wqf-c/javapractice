package com.safay.DemoException;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Author: wqf
 * Date: 2019/10/28
 * Time: 0:44
 */
public class DemoThrows {

  public static void main(String[] args) {
    try {
      test("d:\\a.txt");
    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e){
      e.printStackTrace();
    }finally {
      System.out.println("资源释放");
    }
  }

  public static void test(String fileName) throws IOException {
    if(fileName.equals("c:\\a.txt")){
      throw new FileNotFoundException("文件路径。。。");
    }
    if(!fileName.endsWith(".txt")){
      throw new IOException("文件后缀。。。");
    }
  }
}
