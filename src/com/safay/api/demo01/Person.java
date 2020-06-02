package com.safay.api.demo01;

import java.util.Objects;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 11:13
 */
public class Person {

  String name;
  int age;
  Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
      "name='" + name + '\'' +
      ", age=" + age +
      '}';
  }

//  @Override
//  public boolean equals(Object obj){
//    if(obj == this){
//      return true;
//    }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person)) return false;
    Person person = (Person) o;
    return age == person.age &&
      Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }
//    if(obj == null || obj instanceof Person ){
//      return false;
//    }else{
//      Person p = (Person)obj;
//      if(p.name.equals(this.name) && p.age == this.age){
//        return true;
//      }
//    }
//  }

}
