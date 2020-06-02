package com.safay.DemoMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 23:10
 */
public class DemoMap {

  public static void main(String[] args) {
    demo02();
  }

  //hashmap无序，键唯一
  //linkedhashmap有序，键唯一
  public static void demo01(){
    Map<String, String> map = new HashMap<>();
    String v1 = map.put("aa", "bb");
    String v2 = map.put("aa", "cc");
    System.out.println(v1);
    System.out.println(v2);
    String v3 = map.remove("aa");
    System.out.println(v3);
    map.put("a", "c");
    map.put("q", "d");
  }

  public static void demo02(){
    Map<String, String> map = new HashMap<>();
    String v1 = map.put("aa", "bb");
    map.put("a", "c");
    map.put("q", "d");
    Set<String> key = map.keySet();
    for(String s : key){
      System.out.println(map.get(s));
    }

    Set<Map.Entry<String, String>> set = map.entrySet();
    for(Map.Entry<String, String> entry : set){
      System.out.println(entry.getKey() + "===" + entry.getValue());
    }
  }
}
