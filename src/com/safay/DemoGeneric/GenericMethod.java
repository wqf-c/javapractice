package com.safay.DemoGeneric;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 20:38
 */
public class GenericMethod {

  public <M> void method(M m){
    System.out.println(m);
  }

  public static <E> void method02(E e){
    System.out.println(e);
  }
}
