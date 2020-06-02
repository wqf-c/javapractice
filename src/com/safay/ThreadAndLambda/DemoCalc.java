package com.safay.ThreadAndLambda;

/**
 * Author: wqf
 * Date: 2020/2/18
 * Time: 0:59
 */
public class DemoCalc {

  public static void main(String[] args) {
    invokeCalc(1, 2, new Calc() {
      @Override
      public int calc(int a, int b) {
        return a + b;
      }
    });

    invokeCalc(2, 2, (int a, int b) -> {
      return a + b;
    });
  }

  public static void invokeCalc(int a, int b, Calc calc){
    int c = calc.calc(a, b);
    System.out.println("结果" + c);
  }
}
