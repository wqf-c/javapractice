package com.safay.reflect.dmain;

/**
 * Author: wqf
 * Date: 2020/2/20
 * Time: 11:48
 */
public class Person {
  private String name;
  private int age;
  public String a;
  protected String b;
  String c;
  private String d;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person() {
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

  @Override
  public String toString() {
    return name + age;
  }

  public void eat(){
    System.out.println("eat");
  }

  public void eat(String foot){
    System.out.println("eat " + foot);
  }
}
