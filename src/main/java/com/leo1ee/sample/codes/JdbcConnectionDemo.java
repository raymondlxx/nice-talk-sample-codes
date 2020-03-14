package com.leo1ee.sample.codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author leolee
 * @date 2020/3/14.
 */
public class JdbcConnectionDemo {
  public static void main(String[] args) {
    try {
      Connection connection = DriverManager.getConnection("");

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
