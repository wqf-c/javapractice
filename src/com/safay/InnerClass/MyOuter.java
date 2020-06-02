package com.safay.InnerClass;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 0:39
 */
public class MyOuter {

  public void methodOuter(){
    //只要局部变量事实不变，可以省略final
    int num = 10;
    class MyInner{
      public void methodInner(){
        System.out.println(num);
      }
    }
  }
}
