package com.safay.DemoCollections;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 22:57
 */
public class Person implements Comparable<Person>{

  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  //重写排序规则
  @Override
  public int compareTo(Person o) {
    return this.getAge() - o.getAge();
  }
}
