package com.graphql.service.implementation;

import com.graphql.entities.Course;
import com.graphql.persintence.ICourseDAO;
import com.graphql.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private ICourseDAO courseDAO;

    @Override
    @Transactional(readOnly = true)
    public Course findById(Long id) {
        return courseDAO.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Course> findAll() {
        return (List<Course>) courseDAO.findAll();
    }

    @Override
    @Transactional
    public void createCourse(Course course) {
        courseDAO.save(course);

    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        courseDAO.deleteById(id);

    }
}
