package edu.icet.demo.dto;

import lombok.Data;

@Data
public class Customer {
    Long id;
    String name;
    String city;
    String contact;
}