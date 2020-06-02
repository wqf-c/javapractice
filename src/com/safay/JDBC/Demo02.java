package com.safay.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Author: wqf
 * Date: 2020/2/20
 * Time: 22:26
 */
public class Demo02 {
  public static void main(String[] args) {
    Connection conn = null;
    //事务操作
    try {
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc", "root", "123456");
      String sql1 = "update record set score = score + ? where name = ?";
      String sql2 = "update record set score = score - ? where name = ?";
      conn.setAutoCommit(false);
      PreparedStatement psta = conn.prepareStatement(sql1);
      PreparedStatement psta2 = conn.prepareStatement(sql2);
      psta.setInt(1, 3);
      psta.setString(2, "wqf");
      psta2.setInt(1, 7);
      psta2.setString(2, "aaa");
      psta.executeUpdate();
      psta.executeUpdate();
      conn.commit();
      psta.close();
      psta2.close();
      conn.close();
    }catch (Exception e){
      if(conn != null){
        try {
          conn.rollback();
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
      }

    }

  }
}
