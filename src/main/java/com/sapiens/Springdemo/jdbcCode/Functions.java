package com.sapiens.Springdemo.jdbcCode;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Functions {
    public static void add(Statement statement) throws SQLException {
        Scanner s_name = new Scanner(System.in);
        System.out.println("Insert details for add to Table EmployeeDetails :");
        System.out.println("ID :");
        int ID = s_name.nextInt();
        System.out.println("NAME :");
        String NAME = s_name.next();
        System.out.println("AGE :");
        int AGE = s_name.nextInt();
        System.out.println("DESIG :");
        String DESIG = s_name.next();
        System.out.println("QUALIFICATION :");
        String QUALIFICATION = s_name.next();
        System.out.println("EMAIL :");
        String Email = s_name.next();
        System.out.println("DEPT :");
        String DEPT = s_name.next();
        System.out.println("CONTACT :");
        String CONTACT = s_name.next();
        System.out.println("SALARY :");
        int SALARY = s_name.nextInt();
        System.out.println("TOTAL YEARS OF EXP :");
        int TOTAL_YEARS_OF_EXP = s_name.nextInt();
        String sql = "INSERT INTO EmployeeDetails VALUES('" + ID + "','" + NAME + "','" + AGE + "','" + DESIG + "','" + QUALIFICATION + "','" + Email + "','" + DEPT + "','" + CONTACT + "','" + SALARY + "','" + TOTAL_YEARS_OF_EXP + "')";
        statement.executeUpdate(sql);
        System.out.println("new EmployeeDetails inserted");
    }
    public static void Update(Statement statement) throws SQLException
    {
        Scanner s_name = new Scanner(System.in);
        System.out.println("Insert ID for update Employee :");
        int EMPID = s_name.nextInt();
        System.out.println("Insert Details for update Employee :");
        System.out.println("NAME :");
        String NAME = s_name.next();
        System.out.println("AGE :");
        int AGE = s_name.nextInt();
        System.out.println("DESIG :");
        String DESIG = s_name.next();
        System.out.println("QUALIFICATION :");
        String QUALIFICATION = s_name.next();
        System.out.println("EMAIL :");
        String Email = s_name.next();
        System.out.println("DEPT :");
        String DEPT = s_name.next();
        System.out.println("CONTACT :");
        String CONTACT = s_name.next();
        System.out.println("SALARY :");
        int SALARY = s_name.nextInt();
        System.out.println("TOTAL YEARS OF EXP :");
        int TOTAL_YEARS_OF_EXP = s_name.nextInt();
        String sql = "UPDATE EmployeeDetails SET NAME = '" + NAME + "',AGE='" + AGE + "',DESIG='" + DESIG + "',QUALIFICATION='" + QUALIFICATION + "',Email='" + Email + "',DEPT='" + DEPT + "',CONTACT='" + CONTACT + "',SALARY='" + SALARY + "',TOTAL_YEARS_OF_EXP='" + TOTAL_YEARS_OF_EXP + "' where id = " + EMPID + ";";
        statement.executeUpdate(sql);
        System.out.println("EmployeeDetails UPDATED");
    }
    public static void View(Statement statement) throws SQLException
    {
        String sql = "select * from EmployeeDetails";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            System.out.println("--------------- Employee Data ------------------");
            System.out.println(" \n ID: " + resultSet.getString(1));
            System.out.println(" \n NAME: " + resultSet.getString(2));
            System.out.println("\n Age:  " + resultSet.getString(3));
            System.out.println("\n DESIG:  " + resultSet.getString(4));
            System.out.println("\n QUALIFICATION:  " + resultSet.getString(5));
            System.out.println("\n Email: " + resultSet.getString(6));
            System.out.println("\n DEPT: " + resultSet.getString(7));
            System.out.println("\n CONTACT: " + resultSet.getString(8));
            System.out.println("\n SALARY: " + resultSet.getString(9));
            System.out.println("\n TOTAL YEARS OF EXP :" + resultSet.getString(10));
            System.out.println("Successfully wrote to the file.");
        }
    }
    public static void Delete(Statement statement) throws SQLException
    {
        Scanner s_name = new Scanner(System.in);
        System.out.println("Insert Table Name to delete :");
        String TabletoDelete = s_name.next();
        String sql = "drop table " + TabletoDelete + "";
        statement.executeUpdate(sql);
        System.out.println("Table Deleted");
    }
}
