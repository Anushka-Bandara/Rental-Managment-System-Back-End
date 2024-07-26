package edu.icet.demo.controller;

import edu.icet.demo.dto.Customer;
import edu.icet.demo.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("cust")
@CrossOrigin
public class CustomerController {

    final CustomerService service;

    @PostMapping("add")
    //@ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Customer customer){
        service.save( customer);
    }

    @PostMapping("update")
    public void update(@RequestBody Customer customer){
        service.update(customer);
    }

    @GetMapping("getAll")
    public List<Customer> getAll(){
        return service.getAll();
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
