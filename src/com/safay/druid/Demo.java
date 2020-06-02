package com.safay.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * Author: wqf
 * Date: 2020/2/21
 * Time: 0:13
 */
public class Demo {

  public static void main(String[] args) throws Exception {
    Properties pro = new Properties();
    InputStream is = Demo.class.getClassLoader().getResourceAsStream("druid.properties");
    pro.load(is);
    DataSource ds = DruidDataSourceFactory.createDataSource(pro);
    Connection conn = ds.getConnection();
  }
}
