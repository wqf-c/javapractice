package com.safay.collection;

import java.util.ArrayList;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 20:21
 */
public class DemoForeach {

  public static void main(String[] args) {

  }

  private static void demo01(){
    int[] arr = {1, 2, 3, 4, 5};
    for(int i : arr){
      System.out.println(i);
    }
  }

  private static void demo02(){
    ArrayList<String> array = new ArrayList<>();
    array.add("aaaa");
    array.add("bbbb");
    for(String str : array){
      System.out.println(str);
    }
  }

}
