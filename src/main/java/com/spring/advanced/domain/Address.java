package com.spring.advanced.domain;


import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = "com.spring.advanced.domain")
public class Address {

    private String country;

    private String provinence;

    private String city;

}
