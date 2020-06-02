package com.safay.DemoList;

import sun.tracing.dtrace.DTraceProviderFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 21:20
 */
public class Demo01 {

  public static void main(String[] args) {
//    List<String> list = new ArrayList<>();
//    list.add("a");
//    list.add("b");
//    list.add("c");
//    list.add("d");
//    System.out.println(list);
//    list.add(3, "it");
//    String removeE = list.remove(2);
//  //  String setE = list.set(4, "E");
//    for(int i = 0; i< list.size(); ++i){
//      System.out.println(list.get(i));
//    }
//
//    Iterator<String> it = list.iterator();
//    while (it.hasNext()){
//      System.out.println(it.next());
//    }

    List<Integer> list1 = new ArrayList<>();
    list1.add(123);
    System.out.println(list1.contains(123));

//    for(String s : list){
//      System.out.println(s);
//    }
  }
}
