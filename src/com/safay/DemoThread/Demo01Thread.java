package com.safay.DemoThread;

/**
 * Author: wqf
 * Date: 2020/2/17
 * Time: 1:10
 */
public class Demo01Thread {

  public static void main(String[] args) {
    MyThread m = new MyThread();
    m.start();
    for(int i = 0; i < 20; ++i){
      System.out.println(i);
    }
  }
}

