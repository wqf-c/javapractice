package com.safay.DemoCalendar;

import java.util.Calendar;
import java.util.Date;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 13:06
 */
public class Demo01Calendar {

  public static void main(String[] args) {
    demo01();
  }

  private static void demo01(){
    Calendar c = Calendar.getInstance();
    System.out.println(c);
    System.out.println(c.get(Calendar.YEAR));
    c.set(Calendar.YEAR, 2018);
    c.set(Calendar.DATE, 9);
    System.out.println(c);
    c.add(Calendar.YEAR, 2);
    System.out.println(c);
    System.out.println(c.getTime());
  }
}
