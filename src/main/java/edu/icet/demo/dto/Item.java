package edu.icet.demo.dto;

import lombok.Data;

@Data
public class Item {
    private Long id;
    private String name;
    private boolean isAvailable;
    private Double rentPerDay;
    private Double finePerDay;
}
