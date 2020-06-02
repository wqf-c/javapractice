package com.safay.DemoThread;

/**
 * Author: wqf
 * Date: 2020/2/17
 * Time: 1:23
 */
public class RunnableImp1 implements Runnable {
  @Override
  public void run() {
    for(int i = 0; i < 20; ++i){
      System.out.println(Thread.currentThread().getName() + i);
    }
  }
}
