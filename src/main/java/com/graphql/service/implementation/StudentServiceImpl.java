package com.graphql.service.implementation;

import com.graphql.entities.Student;
import com.graphql.persintence.IStudentDAO;
import com.graphql.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDAO studentDAO;

    @Override
    @Transactional(readOnly = true)
    public Student findById(Long id) {
        return studentDAO.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return (List<Student>) studentDAO.findAll();
    }

    @Override
    @Transactional
    public void createStudent(Student student) {
        studentDAO.save(student);

    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        studentDAO.deleteById(id);

    }
}
