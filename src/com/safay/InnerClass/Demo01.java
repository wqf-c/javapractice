package com.safay.InnerClass;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 0:22
 */
public class Demo01 {

  public static void main(String[] args) {
    Body body = new Body();
    body.methodBody();
    Body.Heart heart = new Body().new Heart();
    heart.beat();

    MyInterface obj = new MyInterfaceImpl();
    obj.method();

    MyInterface interfac = new MyInterface() {
      @Override
      public void method() {
        System.out.println("method");
      }
    };
    interfac.method();
  }
}
