package com.safay.DemoSystem;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 13:25
 */
public class Demo01System {

  public static void main(String[] args) {
    System.out.println(System.currentTimeMillis());
    int[] array01 = new int[]{1, 2, 3, 4, 5};
    int[] array02 = new int[]{5, 6, 8, 9};
    System.arraycopy(array01, 0, array02, 0, 3);
  }
}
