package com.safay.DemoCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 22:53
 */
public class Demo01 {
  public static void main(String[] args) {
    demo3();
  }

  public static void demo1(){
    ArrayList<String> list = new ArrayList<>();
    Collections.addAll(list, "a", "b", "c", "d");
    System.out.println(list);
    Collections.shuffle(list);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);

    ArrayList<Integer> list1 = new ArrayList<>();
    Collections.addAll(list1, 1, 2, 0, 8, 4);
    Collections.sort(list1);
    System.out.println(list1);
  }

  public static void demo2(){
    ArrayList<Person> list = new ArrayList<>();
    Collections.addAll(list, new Person("aa", 10), new Person("bb", 20));
    Collections.sort(list);
  }

  public static void demo3(){
    ArrayList<Integer> list1 = new ArrayList<>();
    Collections.addAll(list1, 1, 2, 0, 8, 4);
    Collections.sort(list1, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1 - o2;
      }
    });
    System.out.println(list1);
  }
}
