package com.safay.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Author: wqf
 * Date: 2020/2/20
 * Time: 12:27
 */
public class reflectCase {

  public static void main(String[] args) throws Exception{
    Properties pro = new Properties();
    ClassLoader classLoader = reflectCase.class.getClassLoader();
    InputStream is = classLoader.getResourceAsStream("application.properties");
    pro.load(is);
    String className = pro.getProperty("className");
    String methodName = pro.getProperty("methodName");
    Class cls = Class.forName(className);
    Object obj = cls.newInstance();
    Method method = cls.getMethod(methodName);
    method.invoke(obj);
  }
}
