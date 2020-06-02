package com.safay.reflect;

import com.safay.reflect.dmain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Author: wqf
 * Date: 2020/2/20
 * Time: 12:00
 */
public class demo02 {

  /**
   Class对象功能：
   * 获取功能：
   1. 获取成员变量们
   * Field[] getFields()
   * Field getField(String name)

   * Field[] getDeclaredFields()
   * Field getDeclaredField(String name)
   2. 获取构造方法们
   * Constructor<?>[] getConstructors()
   * Constructor<T> getConstructor(类<?>... parameterTypes)

   * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
   * Constructor<?>[] getDeclaredConstructors()
   3. 获取成员方法们：
   * Method[] getMethods()
   * Method getMethod(String name, 类<?>... parameterTypes)

   * Method[] getDeclaredMethods()
   * Method getDeclaredMethod(String name, 类<?>... parameterTypes)

   4. 获取类名
   * String getName()
   */

  public static void main(String[] args) throws Exception {
    Class personCLs = Person.class;
    Field[] fields = personCLs.getFields();
    for (Field field : fields){
      System.out.println(field);
    }
    Person p = new Person();
    Field a = personCLs.getField("a");
    Object res = a.get(p);
    a.set(p, "张三");
    Field d = personCLs.getDeclaredField("d");
    d.setAccessible(true);
    Object  value2 = d.get(p);
    System.out.println(value2);

    Constructor constructor = personCLs.getConstructor(String.class, int.class);
    System.out.println(constructor);
    Object obj = constructor.newInstance("张三", 10);
    System.out.println(obj);

    Method method = personCLs.getMethod("eat");
    method.invoke(p);
    Method method2 = personCLs.getMethod("eat", String.class);
    method2.invoke(p, "放");

    Method[] methods = personCLs.getMethods();
    for(Method m : methods){
      String mName = m.getName();
      System.out.println(mName);
      System.out.println(m);
    }
    System.out.println(personCLs.getName());
  }
}
