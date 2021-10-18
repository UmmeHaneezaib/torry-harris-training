package com.torryharris.jdbc;

import com.torryharris.model.Employee;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeJDBCDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/company";
            String username = "root";
            String password = "moandler";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            System.out.println("Connected to DB Successfully");
            System.out.println();

//            String updateQuery="update Employee " + " set designation ='SD' "+ "where year_of_join=2020";
//            System.out.println(updateQuery);
//            int rowsAffected= statement.executeUpdate(updateQuery);
//            System.out.println("No of rows Affected:" +rowsAffected);
            ArrayList<Employee> employeeArrayList = getEmployees();
            insertUsingPreparedStatement(connection,employeeArrayList);
            String query = "select * from employee";
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("Employee Details are");
            System.out.println("-----------------------------------");

            while(resultSet.next()){
                int id = resultSet.getInt("employee_id");
                String name = resultSet.getString("name");
                String designation = resultSet.getString("designation");
                float salary = resultSet.getFloat("salary");
                int yearOfJoin  = resultSet.getInt("year_of_join");
                Employee employee = new Employee(id,name,designation,salary,yearOfJoin);
                System.out.println(employee);
            }
//            for (Employee e : employeeArrayList) {
//                String insertQuery = "insert into employee values(" + e.getId() + ",'" + e.getName() + "','" + e.getDesignation() + "'," + e.getSalary() + "," + e.getYearOfJoin() + ")";
//                System.out.println(insertQuery);
//                statement.execute(insertQuery);
//            }
            System.out.println("Inserted values Successfully");

            statement.close();
            connection.close();


        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

    }

    private static ArrayList<Employee> getEmployees() {
        Employee e1 = new Employee(1, "han", "Manager", 22000f, 2017);
        Employee e2 = new Employee(2, "Sam", "Doctor", 82000f, 2021);
        Employee e3 = new Employee(3, "Zain", "Artist", 62000f, 2020);
        Employee e4 = new Employee(4, "hani", "hacker", 122000f, 2018);
        Employee e5 = new Employee(5, "Zaib", "Teacher", 42000f, 2019);
        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
        employeeArrayList.add(e4);
        employeeArrayList.add(e5);
        return employeeArrayList;
    }
    public static void insertUsingPreparedStatement(Connection connection,ArrayList<Employee> employeeArrayList) throws SQLException {
        String pQuery="insert into employee values(?,?,?,?,?)";
        PreparedStatement ps =connection.prepareStatement(pQuery);
        for(Employee employee:employeeArrayList){
            ps.setInt(1, employee.getId());
            ps.setString(2, employee.getName());
            ps.setString(3, employee.getDesignation());
            ps.setFloat(4, employee.getSalary());
            ps.setInt(5, employee.getYearOfJoin());
            ps.execute();
        }
    }

}