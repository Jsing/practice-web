package com.web.study.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BookEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
