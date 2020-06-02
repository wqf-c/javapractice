package com.safay.functionalInterface;

/**
 * Author: wqf
 * Date: 2020/2/19
 * Time: 22:45
 */
public class Demo {

  public static void main(String[] args) {
    show(new MyFunctionalInterface() {
      @Override
      public void method() {
        System.out.println("aaa");
      }
    });
    show(() -> {
      System.out.println("aaa");
    });
  }

  public static void show(MyFunctionalInterface myInter){
    myInter.method();
  }
}
