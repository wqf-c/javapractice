package com.safay.ThreadAndLambda;

/**
 * Author: wqf
 * Date: 2020/2/18
 * Time: 0:44
 */
public class Demo01Lambda {
  public static void main(String[] args) {
    new Thread(() -> {
      System.out.println(Thread.currentThread().getName());
    }).start();
  }
}
