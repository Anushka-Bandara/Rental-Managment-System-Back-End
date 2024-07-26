package edu.icet.demo.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Rental {
    private Long id;
    private Date rentDate;
    private Date returnDate;
    private Date dueDate;
    private Double fine;
    private Double total;
}
