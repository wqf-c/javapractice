package com.safay.DemoGeneric;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 20:34
 */
public class GenericClass<E> {

  private E name;

  public E getName() {
    return name;
  }

  public void setName(E name) {
    this.name = name;
  }
}
