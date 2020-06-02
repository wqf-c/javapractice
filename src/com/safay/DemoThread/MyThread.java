package com.safay.DemoThread;

/**
 * Author: wqf
 * Date: 2020/2/17
 * Time: 1:13
 */
public class MyThread extends Thread {

  @Override
  public void run() {
    for(int i = 0; i < 20; ++i){
      System.out.println(i);
    }
  }
}
