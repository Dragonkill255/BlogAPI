package net.practices.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity<Object> hihi(){
        String a = "hihi";
        return  new ResponseEntity<Object>(a, HttpStatusCode.valueOf(200));
    }
}
