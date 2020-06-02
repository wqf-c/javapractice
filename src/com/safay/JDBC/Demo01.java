package com.safay.JDBC;

import java.sql.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Author: wqf
 * Date: 2020/2/20
 * Time: 15:23
 */
public class Demo01 {

  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc", "root", "123456");
    String sql = "insert into record values ('wqp', 105)";
    Statement sta = conn.createStatement();
    int count = sta.executeUpdate(sql);
    System.out.println(count);
    sql = "select * from record";
    ResultSet res = sta.executeQuery(sql);
    while (res.next()){
      String name = res.getString(1);
      int score = res.getInt("score");
      System.out.println(name + score);
    }

    sql = "select * from record where name = ?";
    PreparedStatement psta = conn.prepareStatement(sql);
    String name = "aaa";
    psta.setString(1, name);
    ResultSet s = psta.executeQuery();
    System.out.println("======");
    while (s.next()){
      System.out.println(s.getInt("score"));
    }
    psta.close();
    res.close();
    sta.close();
    conn.close();
  }
}
