package com.safay.IO;

import java.io.*;

/**
 * Author: wqf
 * Date: 2020/2/19
 * Time: 1:13
 */
public class ObjectStream {
  public static void main(String[] args) {
    try {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\person.txt"));
      oos.writeObject(new Person(10));
      oos.close();
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\person.txt"));
      Person p = (Person) ois.readObject();
      System.out.println(p.name);
      ois.close();
    }catch (Exception e){
      e.printStackTrace();
    }
  }

}

class Person implements Serializable {
  int name;
  //避免序列化冲突异常
  private static final long serialVersionUID = 1l;
  //static和transient修饰的不能序列化
  static int age;
  transient int a;
  public Person(int name){
    this.name = name;
  }
}
