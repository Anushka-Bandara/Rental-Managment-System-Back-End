package edu.icet.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "RentalDetail")
public class RentalDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long RentalId;
    private Long ItemId;
    private Double totalCost;
    private Integer Qty;
}
