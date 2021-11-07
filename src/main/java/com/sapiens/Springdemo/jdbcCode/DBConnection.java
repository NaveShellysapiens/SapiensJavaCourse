package com.sapiens.Springdemo.jdbcCode;

import com.sun.jdi.event.StepEvent;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;
public class DBConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Task 1 Write a JDBC program to establish and check for the DB connection.

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Connected");

        //Task 2 Write a JDBC program to create a DB named Employee.

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?createDatabaseIfNotExist=TRUE", "root", "root");
        System.out.println("Connection Established Successfully");
        Statement statement = connection.createStatement();
        Scanner s_name = new Scanner(System.in);


        System.out.println("For task 3-7 press 1");
        System.out.println("For crud app press 2");
        int prog =s_name.nextInt();
        switch (prog) {
            case 1:
                //Task 3 Write a JDBC program to create a table named EmployeeDetails with
                // ID, NAME, AGE, DEPT, DESIG, QUALIFICATION, EMAIL ID, CONTACT, SALARY, TOTAL YEARS OF EXP. Also create few other tables for future purpose.

                String sql = "CREATE TABLE EmployeeDetails (ID INT, NAME VARCHAR(20),AGE INT, DEPT VARCHAR(20), DESIG VARCHAR(20),QUALIFICATION VARCHAR(20),Email VARCHAR(20),CONTACT VARCHAR(20),SALARY INT,TOTAL_YEARS_OF_EXP INT, PRIMARY KEY (ID))";
                statement.executeUpdate(sql);
                sql = "CREATE TABLE tables_for_future_purpose (Field1 VARCHAR(20),Field2 VARCHAR(20),Field3 VARCHAR(20),Field4 VARCHAR(20),Field5 VARCHAR(20), PRIMARY KEY (Field1))";
                statement.executeUpdate(sql);
                sql = "CREATE TABLE tables_for_future_purpose1 (Field1 VARCHAR(20),Field2 VARCHAR(20),Field3 VARCHAR(20),Field4 VARCHAR(20),Field5 VARCHAR(20), PRIMARY KEY (Field1))";
                statement.executeUpdate(sql);

                // TODO: 11/7/2021
                //Task 4 Write a JDBC program to insert data into EmployeeDetails table with dynamic mode

               Functions.add(statement);

                //Task 5 Update a specific employee in EmployeeDetails table, ensure to receive the input from the user.
                //Use Scanner object to take input

                Functions.Update(statement);

                // Task 6 Writre a program to select all the data from the EmployeeDetails and save the data in a separate file.

                sql = "select * from EmployeeDetails";
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                    try {
                        FileWriter myWriter = new FileWriter("filename.txt");
                        myWriter.write("--------------- Employee Data ------------------");
                        myWriter.write(" \n ID: " + resultSet.getString(1));
                        myWriter.write(" \n NAME: " + resultSet.getString(2));
                        myWriter.write("\n Age:  " + resultSet.getString(3));
                        myWriter.write("\n DESIG:  " + resultSet.getString(4));
                        myWriter.write("\n QUALIFICATION:  " + resultSet.getString(5));
                        myWriter.write("\n Email: " + resultSet.getString(6));
                        myWriter.write("\n DEPT: " + resultSet.getString(7));
                        myWriter.write("\n CONTACT: " + resultSet.getString(8));
                        myWriter.write("\n SALARY: " + resultSet.getString(9));
                        myWriter.write("\n TOTAL YEARS OF EXP :" + resultSet.getString(10));
                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }

                //Task 7 Write a JDBC program to drop a table from the DB named Employee, receive the input from the user to delete a specific table.
                Functions.Delete(statement);
                break;
            case 2:
            //Task 8 write a java program to implement CRUD operation on JDBC (switch: add, update, delete, view)
                sql = "CREATE TABLE EmployeeDetails (ID INT, NAME VARCHAR(20),AGE INT, DEPT VARCHAR(20), DESIG VARCHAR(20),QUALIFICATION VARCHAR(20),Email VARCHAR(20),CONTACT VARCHAR(20),SALARY INT,TOTAL_YEARS_OF_EXP INT, PRIMARY KEY (ID))";
                statement.executeUpdate(sql);
                sql = "CREATE TABLE tables_for_future_purpose (Field1 VARCHAR(20),Field2 VARCHAR(20),Field3 VARCHAR(20),Field4 VARCHAR(20),Field5 VARCHAR(20), PRIMARY KEY (Field1))";
                statement.executeUpdate(sql);
                sql = "CREATE TABLE tables_for_future_purpose1 (Field1 VARCHAR(20),Field2 VARCHAR(20),Field3 VARCHAR(20),Field4 VARCHAR(20),Field5 VARCHAR(20), PRIMARY KEY (Field1))";
                statement.executeUpdate(sql);
                System.out.println("For Operation to do  Write add, update, delete, view or to exit write exit");
                String Operation =s_name.next();
                while (!Operation.equals("exit")) {
                    switch (Operation) {
                        case "add":
                            Functions.add(statement);
                            break;
                        case "update":
                            Functions.Update(statement);
                            break;
                        case "delete":
                            Functions.Delete(statement);
                            break;
                        case "view":
                            Functions.View(statement);
                            break;
                    }
                    System.out.println("For Operation to do  Write add, update, delete, view or to exit write exit");
                    Operation =s_name.next();
                }

            connection.close();
        }
    }
}
