package com.safay.ThreadAndLambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Author: wqf
 * Date: 2020/2/18
 * Time: 0:53
 */
public class Demo02Sort {

  public static void main(String[] args) {
    Integer[] a = new Integer[]{1, 5, 3, 7};
    Arrays.sort(a, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1 - o2;
      }
    });
    System.out.println(Arrays.toString(a));
    Integer[] b = new Integer[]{8, 0, 2, 7};
    Arrays.sort(b, (Integer o1, Integer o2) -> {
      return o1 - o2;
    });
    System.out.println(Arrays.toString(b));
  }
}
