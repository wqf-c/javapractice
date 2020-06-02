package com.safay.collection;

import javafx.print.Collation;

import java.util.*;

/**
 * Author: wqf
 * Date: 2020/2/16
 * Time: 1:19
 */
public class DemoSort {

  public static void main(String[] args) {
    student s1 = new student(5);
    student s2 = new student(3);
    student s3 = new student(10);
    ArrayList<student> list = new ArrayList<student>();
    Collections.addAll(list, s1, s2, s3);
    Collections.sort(list, new Comparator<student>() {
      @Override
      public int compare(student o1, student o2) {
        return o1.age - o2.age;
      }
    });
    for(student s : list){
      System.out.println(s.age);
    }
  }
}

class student{
  int age;

  public student(int age){
    this.age = age;
  }
}