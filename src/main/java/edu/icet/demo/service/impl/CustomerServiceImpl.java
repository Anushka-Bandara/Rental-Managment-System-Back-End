package edu.icet.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.dto.Customer;
import edu.icet.demo.entity.CustomerEntity;
import edu.icet.demo.repository.CustomerRepository;
import edu.icet.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository repository;

    @Override
    public void save(Customer customer) {
        repository.save(new ObjectMapper().convertValue(customer, CustomerEntity.class));
    }

    @Override
    public void update(Customer customer) {
        if (repository.findById(customer.getId()).isPresent()) {
            repository.save(new ObjectMapper().convertValue(customer, CustomerEntity.class));
        }
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customerList = new ArrayList<>();
        Iterable<CustomerEntity> all = repository.findAll();
        all.forEach(customerEntity ->
                customerList.add(new ObjectMapper().convertValue(customerEntity, Customer.class))
        );
        return customerList;
    }

    @Override
    public void delete(Long id) {
        if (repository.existsById(id))
            repository.deleteById(id);

    }

}
