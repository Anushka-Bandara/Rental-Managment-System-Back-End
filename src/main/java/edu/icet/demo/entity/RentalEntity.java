package edu.icet.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Rental")
public class RentalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private Date rentDate;
    private Date returnDate;
    private Date dueDate;
    private Double fine;
    private Double total;
}
