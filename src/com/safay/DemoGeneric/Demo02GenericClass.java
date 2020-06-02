package com.safay.DemoGeneric;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 20:35
 */
public class Demo02GenericClass {

  public static void main(String[] args) {
    GenericClass gc = new GenericClass();
    gc.setName("hahaha");
    Object obj = gc.getName();
    System.out.println((String)obj);

    GenericClass<Integer> gc2 = new GenericClass<>();
    gc2.setName(1);
    System.out.println(gc2.getName());

    GenericMethod gm = new GenericMethod();
    gm.method(10);
    gm.method("abc");
  }
}
