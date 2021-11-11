package com.sapiens.Springdemo.DAO.manager;

import com.sapiens.Springdemo.DAO.dao.StudentDAO;

import com.sapiens.Springdemo.DAO.model.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentManager")
public class StudentManagerImpl implements StudentManager {
    @Autowired
    StudentDAO dao;
    @Override
    public StudentDTO createNewStudent() {
        return dao.createNewStudent();
    }
}

