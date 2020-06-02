package com.safay.api.demo01;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 11:18
 */
public class Equals {

  public static void main(String[] args) {
    Person p1 = new Person("jaja", 10);
    Person p2 = new Person("kaka", 19);

    System.out.println(p1.equals(p2));
  }
}
