package com.safay.baozhuanlei;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 15:42
 */
public class DemoInteger {

  public static void main(String[] args) {
    Integer i1 = new Integer(1);
    Integer i2 = new Integer("1");
    Integer i3 = Integer.valueOf(1);
    Integer i4 = Integer.valueOf("1");
    int i = i1.intValue();
    Integer i5 = 1;
    i5 = i5 + 2;

    String s1 = ""  + 100;
    String s2 = Integer.toString(200);
    String s3 = String.valueOf(200);
    int j = Integer.parseInt("100");
  }
}
