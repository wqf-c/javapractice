package com.safay.DemoGeneric;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 20:41
 */
public class GenericInterfaceImp1 implements GenericInterface<String> {
  @Override
  public void method(String s) {
    System.out.println(s);
  }
}
