package edu.icet.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.dto.Rental;
import edu.icet.demo.entity.RentalEntity;
import edu.icet.demo.repository.RentalRepository;
import edu.icet.demo.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {

    final RentalRepository repository;

    @Override
    public void save(Rental rental) {
        repository.save(new ObjectMapper().convertValue(rental, RentalEntity.class));
    }

    @Override
    public void update(Rental rental) {
        if(repository.existsById(rental.getId())){
        repository.save(new ObjectMapper().convertValue(rental, RentalEntity.class));}
    }

    @Override
    public void delete(Long id) {
        if(repository.findById(id).isPresent())repository.deleteById(id);
    }

    @Override
    public List<Rental> getAll() {
        List<Rental> list = new ArrayList<>();
        List<RentalEntity> all = repository.findAll();
        all.forEach(rentalEntity ->
            list.add(new ObjectMapper().convertValue(rentalEntity, Rental.class))
        );
        return list;
    }
}
