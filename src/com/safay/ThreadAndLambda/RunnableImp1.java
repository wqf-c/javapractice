package com.safay.ThreadAndLambda;

/**
 * Author: wqf
 * Date: 2020/2/18
 * Time: 0:36
 */
public class RunnableImp1 implements Runnable {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName());
  }
}
