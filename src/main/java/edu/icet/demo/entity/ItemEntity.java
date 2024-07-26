package edu.icet.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "RentItem")
public class ItemEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private boolean isAvailable;
    private Double rentPerDay;
    private Double finePerDay;
}
