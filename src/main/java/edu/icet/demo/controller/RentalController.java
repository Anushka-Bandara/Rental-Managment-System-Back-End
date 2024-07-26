package edu.icet.demo.controller;

import edu.icet.demo.dto.Rental;
import edu.icet.demo.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("rental")
@CrossOrigin
public class RentalController {

    final RentalService service;

    @PostMapping("add")
    public void add(@RequestBody Rental rental){
        service.save(rental);
    }

    @PostMapping("update")
    public void update(@RequestBody Rental rental){
        service.update(rental);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable  Long id){
        service.delete(id);
    }

    @GetMapping("getAll")
    public List<Rental> getAll(){
        return service.getAll();
    }
}
