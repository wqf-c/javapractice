package com.safay.DemoSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 21:58
 */
public class DemoHashSet {
  //查询快 无重复元素 无序
  //保存自定义元素 想要元素不重复 需要重写hashCode和equals方法
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    Iterator<Integer> it = set.iterator();
    while (it.hasNext()){
      System.out.println(it.next());
    }
    HashSet<Person> set1 = new HashSet<>();
    set1.add(new Person("小明", 18));
    set1.add(new Person("小明", 18));
  }
}
