package edu.icet.demo.service;

import edu.icet.demo.dto.Customer;

import java.util.List;

public interface CustomerService {

    void save(Customer customer);

    void update(Customer customer);

    List<Customer> getAll();

    void delete(Long id);
}
