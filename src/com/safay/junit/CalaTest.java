package com.safay.junit;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: wqf
 * Date: 2020/2/20
 * Time: 1:05
 */
public class CalaTest {

  @Before
  public void init(){
    System.out.println("init");
  }

  @After
  public void close(){
    System.out.println("close");
  }

  @Test
  public void addTest(){
    Calc c = new Calc();
    int res = c.add(10, 12);
    Assert.assertEquals(res, 10);
   // System.out.println(c.add(1, 5));
  }
}
