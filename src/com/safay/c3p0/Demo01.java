package com.safay.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Author: wqf
 * Date: 2020/2/20
 * Time: 23:26
 */
public class Demo01 {

  public static void main(String[] args) {
    DataSource ds = new ComboPooledDataSource();
    Connection conn = null;
    try {
      conn = ds.getConnection();
      System.out.println(conn);
    } catch (SQLException e) {
      e.printStackTrace();
    }finally {
      if(conn != null){
        try {
          conn.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }

  }
}
