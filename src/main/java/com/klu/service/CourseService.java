package com.klu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.model.Course;
import com.klu.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;

    public Course addCourse(Course course) {
        return repository.save(course);
    }

    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    public Optional<Course> getCourseById(Long id) {
        return repository.findById(id);
    }

    public Course updateCourse(Course course) {
        return repository.save(course);
    }

    public void deleteCourse(Long id) {
        repository.deleteById(id);
    }

    public List<Course> searchByTitle(String title) {
        return repository.findByTitleContainingIgnoreCase(title);
    }
}