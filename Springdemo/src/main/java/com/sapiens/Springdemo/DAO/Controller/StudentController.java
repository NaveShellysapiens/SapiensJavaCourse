package com.sapiens.Springdemo.DAO.Controller;


import com.sapiens.Springdemo.DAO.manager.StudentManager;
import com.sapiens.Springdemo.DAO.model.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("studentController")
public class StudentController {
    @Autowired
    StudentManager manager;

    public StudentDTO createNewStudent(){
        return manager.createNewStudent();
    }
}
