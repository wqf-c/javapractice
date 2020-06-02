package com.safay.JdbcTemplete;

import com.safay.druid.JDBCUtil;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Author: wqf
 * Date: 2020/2/21
 * Time: 0:26
 */
public class Demo {

  public static void main(String[] args) {
    JdbcTemplate template = new JdbcTemplate(JDBCUtil.getDs());
    String sql = "update record set score = 100 where name = 'wqf'";
    int count = template.update(sql);
    System.out.println(count);
  }
}
