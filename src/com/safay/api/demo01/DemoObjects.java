package com.safay.api.demo01;

import java.util.Objects;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 11:32
 */
public class DemoObjects {

  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = null;

//    boolean b = s1.equals(s2);
    boolean b2 = Objects.equals(s1, s2);
    System.out.println(b2);
  }
}
