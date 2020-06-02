package com.safay.DemoStringBuilder;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 15:30
 */
public class Demo {
  public static void main(String[] args) {
    demo();
  }

  private static void demo(){
    StringBuilder bu1 = new StringBuilder();
    StringBuilder bu2 = bu1.append("abc");
    bu1.append(true);
    bu1.append(1.2);
    System.out.println(bu1);
    System.out.println(bu2);
    System.out.println(bu1 == bu2);
    bu1.reverse();
    System.out.println(bu1);
  }
}
