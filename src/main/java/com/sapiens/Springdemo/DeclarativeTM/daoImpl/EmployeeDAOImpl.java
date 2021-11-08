package com.sapiens.Springdemo.DeclarativeTM.daoImpl;

import com.sapiens.Springdemo.DeclarativeTM.dao.EmployeeDAO;

import com.sapiens.Springdemo.DeclarativeTM.model.Employee;
import com.sapiens.Springdemo.DeclarativeTM.model.EmployeeDetails;
import com.sapiens.Springdemo.DeclarativeTM.model.PersonalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Employee findEmployee(int empId) {
        final String SELECT_BY_ID_QUERY = "select emp.id, name, age, salary, deptname,designation,qualification,address,contact,email_ID"+
                " from employee emp, PI p , ED e " +
                "where emp.id = p.id and emp.id = ? and emp.id=e.id";
        return this.jdbcTemplate.queryForObject(SELECT_BY_ID_QUERY, new EmployeeMapper(), empId);
    }

    private static final class EmployeeMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee emp = new Employee();
            EmployeeDetails ED = new EmployeeDetails();
            PersonalInfo PI = new PersonalInfo();
            emp.setId(rs.getInt("id"));
            emp.setName(rs.getString("name"));
            emp.setAge(rs.getInt("age"));
            emp.setSalary(rs.getInt("salary"));
            ED.setDeptname(rs.getString("Deptname"));
            ED.setDesignation(rs.getString("Designation"));
            ED.setQualification(rs.getString("Qualification"));
            PI.setAddress(rs.getString("Address"));
            PI.setContact(rs.getInt("contact"));
            PI.setEmail_ID(rs.getString("email_ID"));
            emp.setED(ED);
            emp.setPI(PI);
            return emp;
        }
    }

    @Override
    public void insertEmployee(Employee emp) {
        final String INSERT_EMP_QUERY = "insert into employee(id, name, age,salary)values (?,?,?,?)";
        final String INSERT_PI_QUERY = "insert into PI(id, address, contact,email_id) values (?,?,?,?)";
        final String INSERT_ED_QUERY = "insert into ED(id,deptname,designation,qualification) values (?,?,?,?)";
        jdbcTemplate.update(INSERT_EMP_QUERY, emp.getId(), emp.getName(), emp.getAge(),emp.getSalary());
        System.out.println("Employee inserted Successfully");
        jdbcTemplate.update(INSERT_PI_QUERY, emp.getId(), emp.getPI().getAddress(), emp.getPI().getContact(),emp.getPI().getEmail_ID());
        System.out.println("Personal_Info inserted successfully");
        jdbcTemplate.update(INSERT_ED_QUERY, emp.getId(), emp.getED().getDeptname(), emp.getED().getDesignation(),emp.getED().getQualification());
        System.out.println("Employee_Details inserted successfully");
    }
}

