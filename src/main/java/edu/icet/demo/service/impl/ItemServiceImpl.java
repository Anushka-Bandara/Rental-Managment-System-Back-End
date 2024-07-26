package edu.icet.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.dto.Item;
import edu.icet.demo.entity.ItemEntity;
import edu.icet.demo.repository.ItemRepository;
import edu.icet.demo.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    final ItemRepository repository;

    @Override
    public void save(Item item) {
        repository.save(new ObjectMapper().convertValue(item, ItemEntity.class));
    }

    @Override
    public void update(Item item) {
        if(repository.findById(item.getId()).isPresent()){
        repository.save(new ObjectMapper().convertValue(item, ItemEntity.class));}
    }

    @Override
    public void delete(Long id) {
        if(repository.existsById(id))repository.deleteById(id);
    }

    @Override
    public List<Item> getAll() {
        List<Item> list = new ArrayList<>();
        List<ItemEntity> all = repository.findAll();
        all.forEach(itemEntity ->
            list.add(new ObjectMapper().convertValue(itemEntity, Item.class))
        );
        return list;
    }

}
