package com.sapiens.springmvc.EmployeeCompanyContact.Controller;

import com.sapiens.springmvc.EmployeeCompanyContact.models.CompanyDetails;
import com.sapiens.springmvc.EmployeeCompanyContact.models.Contact;
import com.sapiens.springmvc.EmployeeCompanyContact.models.Employee;
import com.sapiens.springmvc.EmployeeCompanyContact.service.CompanyDetailsService;
import com.sapiens.springmvc.EmployeeCompanyContact.service.ContactService;
import com.sapiens.springmvc.EmployeeCompanyContact.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpComConController {
   @Autowired
    private CompanyDetailsService cds;
    @Autowired
    private ContactService CS;
    @Autowired
    private EmployeeService ES;
    @GetMapping(path = "/CompanyDetails" , produces = "application/json")
    public List<CompanyDetails> getCompanyDetails(){
        List<CompanyDetails> CompanyD = cds.findAll();
        return CompanyD;
    }

    @GetMapping(path = "/Employees" , produces = "application/json")
    public List<Employee> getEmployees(){
        List<Employee> emp = ES.findAll();
        return emp;
    }
    @GetMapping(path = "/Contacs" , produces = "application/json")
    public List<Contact> getContacs(){
        List<Contact> con = CS.findAll();
        return con;
    }
}
