package com.mojo.student_log_api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Controller {

    private final StudentRepository studentRepository;

    public Controller(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public List<Students> read() {
        return studentRepository.findAll();
    }

    @PostMapping("/students")
    public Students create(@RequestBody Students students) {

        return studentRepository.save(students);
    }

    @GetMapping("/students/{id}")
    public Students readById(@PathVariable("id") Integer id) {

        return studentRepository.findById(id).orElse(null);
    }

    @GetMapping("/students/search/{name}")
    public List<Students> getMethodName(@PathVariable("name") String name) {
        return studentRepository.findAllByFirstnameContaining(name);
    }

    @DeleteMapping("/students/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String delete(@PathVariable("id") Integer id) {
        studentRepository.deleteById(id);
        return "The user of " + id + " user have been deleted ";
    }

}
