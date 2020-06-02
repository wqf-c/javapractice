package com.safay.WaitAndNotify;

/**
 * Author: wqf
 * Date: 2020/2/18
 * Time: 0:26
 */
public class Demo {

  public static void main(String[] args) {
    Baozi bz = new Baozi();
    new Baozipu(bz).start();
    new CHihuo(bz).start();
  }
}
