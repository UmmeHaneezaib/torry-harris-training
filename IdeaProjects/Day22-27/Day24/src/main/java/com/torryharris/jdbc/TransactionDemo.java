package com.torryharris.jdbc;

import java.sql.*;

public class TransactionDemo {
    static Connection connection;
    static Savepoint savepoint;
    public static void main(String[] args) throws SQLException {
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          String url = "jdbc:mysql://localhost:3306/company";
          String username = "root";
          String password = "moandler";
          Connection connection = DriverManager.getConnection(url, username, password);
          System.out.println("Connected to DB Successfully");
          Statement statement = connection.createStatement();
          connection.setAutoCommit(false);
          String q1 ="update employee set salary=42000" + "where employee_id=1";
          statement.executeUpdate(q1);
          savepoint = connection.setSavepoint("savepoint1");
          System.out.println("Query1 Executed successfull");

          String q2 ="update employee set designation='Network Engineer'" + "where employee_id=4";
          statement.executeUpdate(q2);
          System.out.println("Query2 Executed successfull");
          String q3 ="insert into employee values(1,'azu','Doctor',10000f,2021)";
          statement.execute(q3);
          System.out.println("Query3 Executed successfull");
          connection.commit();
          statement.close();
          connection.close();
      } catch (SQLException throwables) {
          connection.rollback(savepoint);
          connection.commit();
          System.out.println("Transaction rolled back to savepoint1");
          throwables.printStackTrace();
      } catch (ClassNotFoundException e) {
          connection.rollback(savepoint);
          connection.commit();
          System.out.println("Transaction rolled back to savepoint1");
          e.printStackTrace();
      }

    }
}
