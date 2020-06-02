package com.safay.DemoGeneric;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 20:45
 */
public class DemoGenericInterface {

  public static void main(String[] args) {
    GenericInterfaceImp1 gi1 = new GenericInterfaceImp1();
    gi1.method("abc");

    GenericInterfaceImp2<String> gi2 = new GenericInterfaceImp2<>();
    gi2.method("abc");
  }
}
