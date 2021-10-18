package com.torryharris.jdbc;

import com.torryharris.model.Employee;
import com.torryharris.model.Insurance;

import java.sql.*;
import java.util.ArrayList;

public class InsuranceJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/company";
            String username = "root";
            String password = "moandler";
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            System.out.println("Connected to DB Successfully");
            System.out.println("Insurance Details are");
            System.out.println("-----------------------------------");
            String query = "select * from insurance";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String insName = resultSet.getString("ins_name");
                int insId = resultSet.getInt("ins_id");
                int sum = resultSet.getInt("sum");
                String insType = resultSet.getString("ins_type");
                Insurance insurance = new Insurance(insName, insId, sum, insType);
                System.out.println(insurance);

            }
            System.out.println();
            System.out.println("All the Insurances with type term Insurance are:");
            String query1 = "select * from insurance "+" where ins_type = 'Term Insurance'";
            ResultSet resultSet1 = statement.executeQuery(query1);
            while (resultSet1.next()) {
                String insName = resultSet1.getString("ins_name");
                int insId = resultSet1.getInt("ins_id");
                int sum = resultSet1.getInt("sum");
                String insType = resultSet1.getString("ins_type");
                Insurance insurance1 = new Insurance(insName, insId, sum, insType);
                System.out.println(insurance1);

            }
            System.out.println();
            System.out.println("Order by Sum:");
            String query2 = "select * from insurance "+" order by sum asc";
            ResultSet resultSet2 = statement.executeQuery(query2);
            while (resultSet2.next()) {
                String insName = resultSet2.getString("ins_name");
                int insId = resultSet2.getInt("ins_id");
                int sum = resultSet2.getInt("sum");
                String insType = resultSet2.getString("ins_type");
                Insurance insurance2 = new Insurance(insName, insId, sum, insType);
                System.out.println(insurance2);

            }
            System.out.println();
            System.out.println("Data for Sum greater than 300000");
            String query3 = "select * from insurance "+" where sum > 300000";
            ResultSet resultSet3 = statement.executeQuery(query3);
            while (resultSet3.next()) {
                String insName = resultSet3.getString("ins_name");
                int insId = resultSet3.getInt("ins_id");
                int sum = resultSet3.getInt("sum");
                String insType = resultSet3.getString("ins_type");
                Insurance insurance3 = new Insurance(insName, insId, sum, insType);
                System.out.println(insurance3);

            }
//            System.out.println();
//            System.out.println("Increaed sum by 20%");
//            String updateQuery="update insurance " + " set sum = sum+(sum * 20/100) "+ "where ins_type='Health Insurance'";
//            System.out.println(updateQuery);
//            int rowsAffected= statement.executeUpdate(updateQuery);
//            System.out.println("No of rows Affected:" +rowsAffected);




//            ArrayList<Insurance> insuranceArrayList =getInsuranceDetails();
//                    for (Insurance i : insuranceArrayList){
//                        String insertQuery = "insert into insurance values("+"'"+i.getInsName() + "'," + i.getInsId() + "," + i.getSum() + ",'" + i.getInsType() +"')";
//                System.out.println(insertQuery);
//                statement.execute(insertQuery);
//            }

//            System.out.println("Inserted values Successfully");

            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }
}

//    public static ArrayList<Insurance> getInsuranceDetails() {
////            Insurance i1 = new Insurance("LIC", 1234, 300000,"Car Insurance");
////            Insurance i2 = new Insurance("BHEEMA", 1235, 700000,"Parental Insurance");
////            Insurance i3 = new Insurance("IDFC", 1236, 400000,"Bike Insurance");
////            Insurance i4 = new Insurance("HDFC", 1237, 350000,"Term Insurance");
////            Insurance i5 = new Insurance("LIC", 1238, 500000,"Health Insurance");
////            Insurance i6 = new Insurance("ICC", 1239, 900000,"Term Insurance");
////            ArrayList<Insurance> insuranceArrayList = new ArrayList<Insurance>();
////            insuranceArrayList.add(i1);
////            insuranceArrayList.add(i2);
////            insuranceArrayList.add(i3);
////            insuranceArrayList.add(i4);
////            insuranceArrayList.add(i6);
////            return insuranceArrayList;
//
