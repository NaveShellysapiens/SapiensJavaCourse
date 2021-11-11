package com.sapiens.SpringSecurity.EmployeeManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> listAll(){
        return repository.findAll();
    }

    public void save(Employee emp){
        repository.save(emp);
    }

    public Employee get(long id){
        return repository.findById(id).get();
    }

    public void delete(long id){
        repository.deleteById(id);
    }


}
