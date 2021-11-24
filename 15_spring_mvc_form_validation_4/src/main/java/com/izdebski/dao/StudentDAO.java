package com.izdebski.dao;

import com.izdebski.model.Student;

public interface StudentDAO {
    public abstract boolean saveStudent(Student student);
    public Student getStudentDetailsByEmailAndPassword(String email,String password);
}