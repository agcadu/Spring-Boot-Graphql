package com.graphql.controller;

import com.graphql.entities.Course;
import com.graphql.graphql.InputCourse;
import com.graphql.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class graphQLCourseController {

    @Autowired
    private ICourseService courseService;

    @QueryMapping(name = "findCourseById")
    public Course findById(@Argument(name ="courseId") String id) {
        Long courseId = Long.parseLong(id);

        return courseService.findById(courseId);
    }

    @QueryMapping(name = "findAllCourses")
    public List<Course> findAll() {
        return courseService.findAll();
    }

    @MutationMapping
    public Course createCourse(@Argument InputCourse inputCourse) {
        Course course = new Course();
        course.setName(inputCourse.getName());
        course.setCategory(inputCourse.getCategory());
        course.setTeacher(inputCourse.getTeacher());

        courseService.createCourse(course);

        return course;
    }

    @MutationMapping(name = "deleteCourseById")
    public String deleteById(@Argument(name ="courseId") String id) {

        courseService.deleteById(Long.parseLong(id));

        return "Course id: " + id + " deleted";
    }
}
