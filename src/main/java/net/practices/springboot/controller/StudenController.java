package net.practices.springboot.controller;

import net.practices.springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudenController {

    @GetMapping("/student")
    public Student getStudent(){
        Student student = new Student(1,"Hung","Nguyen");
        return  student;
    };

    @GetMapping("/studentlist")
    public List<Student> getStudentList(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Hung","Nguyen"));
        studentList.add(new Student(2,"Hung2","Nguyen Hung 2"));
        return studentList;
    };

    //{id} URI template variable
    @GetMapping("/student/{id}")
    public Student studentPAthVariable(@PathVariable("id") int id){

        return new Student(id,"Hung2","Nguyen Hung 2");
    };


    //RequestParam
    @GetMapping("/student/query")
    public Student studentRequestParam(@RequestParam() int id,
                                       @RequestParam() String firstName,
                                       @RequestParam() String lastName
    ){
        return new Student(id,firstName,lastName);
    };

    @PostMapping("student/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student>  createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return new ResponseEntity<>(student,HttpStatus.CREATED);
    }


}
