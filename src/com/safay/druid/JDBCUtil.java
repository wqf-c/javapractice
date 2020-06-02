package com.safay.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Author: wqf
 * Date: 2020/2/21
 * Time: 0:16
 */
public class JDBCUtil {
  private static DataSource ds;
  static {
    try {
      Properties pro = new Properties();
      pro.load(JDBCUtil.class.getClassLoader().getResourceAsStream("druid.properties"));

      ds = DruidDataSourceFactory.createDataSource(pro);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public static Connection getConnection() throws SQLException {
    return ds.getConnection();
  }

  public static DataSource getDs(){
    return ds;
  }

}
