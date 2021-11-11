package com.sapiens.springmvc.StudentManagment.Repository;

import com.sapiens.springmvc.StudentManagment.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
