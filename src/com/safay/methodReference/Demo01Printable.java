package com.safay.methodReference;

/**
 * Author: wqf
 * Date: 2020/2/20
 * Time: 0:03
 */
public class Demo01Printable {

  public static void printString(Printable p){
    p.print("helloworld");
  }
  public static void main(String[] args) {
    printString((s) -> {
      System.out.println(s);
    });
  }
}
