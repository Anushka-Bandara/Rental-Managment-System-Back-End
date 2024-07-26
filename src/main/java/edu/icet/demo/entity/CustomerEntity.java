package edu.icet.demo.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name ="Customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String city;
    String contact;
}
