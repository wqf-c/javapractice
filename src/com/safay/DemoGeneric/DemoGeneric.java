package com.safay.DemoGeneric;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 20:48
 */
public class DemoGeneric {

  public static void main(String[] args) {
    ArrayList<String> arr1 = new ArrayList<>();
    arr1.add("aaa");
    arr1.add("bbb");
    arr1.add("ccc");
    printArray(arr1);

    ArrayList<Integer> arr2 = new ArrayList<>();
    arr2.add(1);
    arr2.add(2);
    arr2.add(3);
    printArray(arr2);
  }

  //作为参数的时候可以用?作为通配符
  public static void printArray(ArrayList<?> list){
    Iterator it = list.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}
