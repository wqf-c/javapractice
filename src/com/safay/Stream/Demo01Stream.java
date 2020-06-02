package com.safay.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Author: wqf
 * Date: 2020/2/19
 * Time: 23:10
 */
public class Demo01Stream {
  //流只能使用一次，再次使用会抛异常
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("aaa");
    list.add("345asa");
    list.add("hahaha");
    list.stream()
      .filter(name -> name.startsWith("a") && name.length() == 3)
      .filter(name -> name.endsWith("a"))
      .forEach(name -> System.out.println(name));
    //另一种获取流的方法

    Stream.of(1, 2, 3, 4, 5);
    Stream<String> stream = Stream.of("1", "3", "5");
    Stream<Integer> stream1 = stream.map((String s) -> {
      return Integer.parseInt(s);
    });
    stream1.forEach(i -> System.out.println(i));
    Stream.of(1, 2, 3, 4).count();
    //截取前几个
    Stream.of(1, 2, 3, 5).limit(3);
    //跳过前几个
    Stream.of(1, 2, 3, 5).skip(3);
    //合并流
    Stream.concat(Stream.of(1, 2, 3), Stream.of(10, 12, 14));

  }
}
