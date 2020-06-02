package com.safay.reflect;

import com.safay.reflect.dmain.Person;

/**
 * Author: wqf
 * Date: 2020/2/20
 * Time: 11:52
 */
public class reflectDemo01 {

  public static void main(String[] args) {
    try {
      Class cls1 = Class.forName("com.safay.reflect.dmain.Person");
      //多用于配置文件
      System.out.println(cls1);
      Class cls2 = Person.class;
      //多用于参数传递
      System.out.println(cls2);
      Person p = new Person();
      //用于获取对象的字节码
      Class cls3 = p.getClass();
      System.out.println(cls3);
      //同一个*.class文件在一次程序允许过程中，
      // 只被加载一次，用什么方式获取的class对象都是同一个
      System.out.println(cls1 == cls2);
      System.out.println(cls2 == cls3);
    }catch (Exception e){
      e.printStackTrace();
    }

  }
}
