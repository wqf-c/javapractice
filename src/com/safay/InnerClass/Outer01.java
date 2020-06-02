package com.safay.InnerClass;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 0:36
 */
public class Outer01 {

  public void methodOuter(){
    class Inner{
      int num = 10;
      public void methodInner(){
        System.out.println(num);
      }
    }
    Inner inner = new Inner();
    inner.methodInner();
  }
}
