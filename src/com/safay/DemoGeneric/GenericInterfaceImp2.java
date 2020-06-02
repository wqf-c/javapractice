package com.safay.DemoGeneric;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 20:43
 */
public class GenericInterfaceImp2<I> implements GenericInterface<I> {
  @Override
  public void method(I i) {
    System.out.println(i);
  }
}
