package com.safay.DemoSet;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 22:44
 */
public class DemoLinkedHashSet {

  //linkedHashSet有序，继承至hashset
  public static void main(String[] args) {
    LinkedHashSet<String> set = new LinkedHashSet<>();
    set.add("a");
    set.add("b");
    set.add("c");
    for (String s : set) {
      System.out.println(s);
    }
  }
}
