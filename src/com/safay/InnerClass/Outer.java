package com.safay.InnerClass;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 0:33
 */
public class Outer {

  int num = 20;

  public class Inner{
    int num = 10;

    public void  methodInner(){
      int num = 30;
      System.out.println(num);
      System.out.println(this.num);
      System.out.println(Outer.this.num);
    }
  }
}
