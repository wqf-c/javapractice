package com.safay.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 17:17
 */
public class DemoCollecion {

  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>();

    collection.add("aaa");
    collection.add("bbb");
    collection.add("ccc");
    collection.add("ddd");

    collection.remove("aaa");
    System.out.println(collection.contains("bbb"));
    System.out.println(collection.size());
    System.out.println(collection.isEmpty());
    Object[] array =  collection.toArray();
    System.out.println(collection);
    collection.clear();
  }
}
