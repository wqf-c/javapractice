package com.safay.DemoDateFormat;

import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 12:58
 */
public class Demo01 {

  public static void main(String[] args) throws ParseException {
   // demo02();
    demo03();
  }

  private static void demo(){
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date d = new Date();
    System.out.println(format.format(d));
  }

  private static void demo02() throws ParseException {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date d = format.parse("2019-10-27 13:02:40");
    System.out.println(d);
  }

  private static void demo03(){
    try{
      List<ArrayList<String>> list = new ArrayList<>();
      //out of memeory
      while (true){
        list.add(new ArrayList<>(10000));
      }
    }catch (Exception e){
      e.printStackTrace();
    }
  }

}
