package com.safay.DemoThread;

/**
 * Author: wqf
 * Date: 2020/2/17
 * Time: 1:27
 */
public class InnerClassThread {

  public static void main(String[] args) {
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("hahah");
      }
    }).start();
  }
}
