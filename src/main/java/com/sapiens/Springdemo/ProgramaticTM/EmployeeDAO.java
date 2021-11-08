package com.sapiens.Springdemo.ProgramaticTM;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    private JdbcTemplate jdbcTemplate;
    private TransactionTemplate transactionTemplate;

    // setter and getter for TransactionTemplate


    public TransactionTemplate getTransactionTemplate() {

        return transactionTemplate;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    //setter and getter for Jdbc Template

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //create a table

    public void createTable() {
        String query = "CREATE TABLE Employee(ID INT,NAME VARCHAR(20),age INT,desig VARCHAR(20),Salary INT,contact INT)";
        jdbcTemplate.execute(query);
    }

    //adding Emoloyee

    public void addEmployee(int id, String name, int age,String desig , int Salary , int contact) {
        String query = "INSERT INTO Employee VALUES(" + id + ",'" + name + "'," + age + ",'" + desig + "'," + Salary + "," + contact + ")";
        jdbcTemplate.execute(query);
    }

    //delete Emoloyee
    public void deleteEmployee(int id) {
        String query = "DELETE FROM Employee WHERE ID =" + id;
        jdbcTemplate.execute(query);
    }

    //count of data
    public int countEmployee() {
        String query = "select count(*) from Employee";
        int count=jdbcTemplate.queryForObject(query, Integer.class);
        System.out.println(count);
        return count;
    }

    // extracting the data

    public List<Employee> getAllEmployee() {
        String query = "select * from Employee";
        return jdbcTemplate.query(query, new ResultSetExtractor<List<Employee>>() {
            @Override
            public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<Employee> employeeList = new ArrayList<Employee>();
                while (rs.next()) {
                    Employee employee = new Employee();
                    employee.setID(rs.getInt("id"));
                    employee.setName(rs.getString("name"));
                    employee.setAge(rs.getInt("age"));
                    employee.setDesig(rs.getString("desig"));
                    employee.setSalary(rs.getInt("salary"));
                    employee.setContact(rs.getInt("contact"));
                    employeeList.add(employee);
                }
                return employeeList;
            }
        });
    }

    public void updateSalary(int id, int Salary) {

        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                try {
                    getJdbcTemplate().update("update Employee set salary = ? where id =?", Salary, id);
                } catch (Exception e) {
                    status.isRollbackOnly();
                }
                return null;
            }
        });
    }

    public void updateAge(int id, int age) {
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                try {
                    getJdbcTemplate().update("update Employee set age = ? where id =?", age, id);
                } catch (Exception e) {
                    status.isRollbackOnly();
                }
                return null;
            }
        });
    }
    public void updateContact(int id , int contact)
    {
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus status) {
                try {
                    getJdbcTemplate().update("update Employee set contact = ? where id =?", contact, id);
                } catch (Exception e) {
                    status.isRollbackOnly();
                }
                return null;
            }
        });
    }
    public void DataExtracting ()
    {
        List<Employee> allEmployees = this.getAllEmployee();
        for (Employee employees : allEmployees) {
            System.out.println("Employee ID: " + employees.getID());
            System.out.println("Employee Name: " + employees.getName());
            System.out.println("Employee's age: " + employees.getAge());
            System.out.println("Employee's Desig: " + employees.getDesig());
            System.out.println("Employee's salary: " + employees.getSalary());
            System.out.println("Employee's contact: " + employees.getContact());
        }
        System.out.println("END OF EXTRACT\n");
    }
}