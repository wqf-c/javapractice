package com.safay.DemoVarArgs;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 22:49
 */
public class Demo01VarArgs {

  public static void main(String[] args) {
    System.out.println(add(0, 1, 2, 3, 4));
  }

  //一个方法只能有一个可变参数，若有多个参数，则可变参数应该在最后

  public static int add(int...arr){
    int sum = 0;
    for(int i : arr){
      sum += i;
    }

    return sum;
  }
}
