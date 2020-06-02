package com.safay.DemoDate;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 12:47
 */
public class Demo01 {

  public static void main(String[] args) {
    demo02();
  }

  private static void demo02(){
    Date date = new Date(10000000);
    System.out.println(date);
    System.out.println(date.getTime());
  }

  private static void demo01(){
    Date date = new Date();
    System.out.println(date);
  }
}
