package com.safay.File;

import java.io.File;

/**
 * Author: wqf
 * Date: 2020/2/18
 * Time: 1:17
 */
public class ListDir {
  public static void main(String[] args) {
    listDir("D:\\java\\02-Java语进阶\\day06_线程、同步\\code\\06_Thread\\src\\com\\itheima");
  }

  public static void listDir(String path){
    if(path.isEmpty()) return;
    File dir = new File(path);
    if(!dir.exists()) return;
    if(dir.isDirectory()){
      File[] files = dir.listFiles();
      for(File f: files){
        listDir(f.getAbsolutePath());
      }
    }else{
      System.out.println(dir.getAbsoluteFile());
    }
  }
}
