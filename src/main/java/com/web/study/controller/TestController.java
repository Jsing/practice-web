package com.web.study.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.dto.Book;

@RestController
@RequestMapping(value = "/api")
public class TestController {

    @PostMapping(path = "/book/{id}")
    public Book getBook(@PathVariable Integer id) {
        System.out.println("id = " + id);
        return new Book("My Name");
    }
}
