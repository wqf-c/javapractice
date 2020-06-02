package com.safay.DemoThread;

/**
 * Author: wqf
 * Date: 2020/2/17
 * Time: 1:23
 */
public class DemoRunnable {

  public static void main(String[] args) {
    RunnableImp1 imp = new RunnableImp1();
    Thread t = new Thread(imp);
    t.start();
    for(int i = 0; i < 20; ++i){
      System.out.println(Thread.currentThread().getName() + i);
    }
  }
}
