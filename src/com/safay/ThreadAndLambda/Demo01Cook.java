package com.safay.ThreadAndLambda;

/**
 * Author: wqf
 * Date: 2020/2/18
 * Time: 0:49
 */
public class Demo01Cook {

  public static void main(String[] args) {
    invokeCook(new Cook() {
      @Override
      public void cook() {
        System.out.println("我压迫次饭了");
      }
    });
    invokeCook(() ->{
      System.out.println("我要吃饭了");
    });
  }

  public static void invokeCook(Cook cook){
    cook.cook();
  }
}
