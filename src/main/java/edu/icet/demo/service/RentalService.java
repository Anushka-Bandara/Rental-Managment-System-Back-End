package edu.icet.demo.service;

import edu.icet.demo.dto.Rental;

import java.util.List;

public interface RentalService{
    void save(Rental rental);

    void update(Rental rental);

    void delete(Long id);

    List<Rental> getAll();
}
