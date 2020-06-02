package com.safay.InnerClass;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 0:27
 */
public class Body {

  public class Heart{
    public void beat(){
      System.out.println("哈哈哈");
      System.out.println("我是" + name);
    }
  }

  private String name;
  public void  methodBody(){
    System.out.println("外部类的方法");
    Heart heart = new Heart();
    heart.beat();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
