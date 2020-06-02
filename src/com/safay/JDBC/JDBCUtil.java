package com.safay.JDBC;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Author: wqf
 * Date: 2020/2/20
 * Time: 21:55
 */
public class JDBCUtil {

  private static String url;
  private static String user;
  private static String password;
  private static String driver;

  static {
    Properties pro = new Properties();
    try {
      pro.load(new FileReader("src/jdbc.properties"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    url = pro.getProperty("url");
    password = pro.getProperty("password");
    user = pro.getProperty("user");
    driver = pro.getProperty("driver");
    try {
      Class.forName(driver);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(url, user, password);
  }

  public static void close(Statement ste) throws SQLException {
    if(ste != null) ste.close();
  }

  public static void close(Statement sta, Connection con, ResultSet res){
    if(sta != null){
      try {
        sta.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if(con != null){
      try {
        con.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    if(res != null){
      try {
        res.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
