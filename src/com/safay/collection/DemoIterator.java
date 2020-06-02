package com.safay.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 17:25
 */
public class DemoIterator {
  public static void main(String[] args) {
    Collection<String> col = new ArrayList<>();
    col.add("aaa");
    col.add("bbb");
    Iterator<String> it = col.iterator();
    while (it.hasNext()){
      System.out.println(it.next());
    }
  }
}
