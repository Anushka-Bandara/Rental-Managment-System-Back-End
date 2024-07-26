package edu.icet.demo.dto;

import lombok.Data;

@Data
public class RentalDetail {
    private Long RentalId;
    private Long ItemId;
    private Double totalCost;
    private Integer Qty;
}
