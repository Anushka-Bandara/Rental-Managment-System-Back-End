package edu.icet.demo.service;

import edu.icet.demo.dto.Item;

import java.util.List;

public interface ItemService {
    void save(Item item);

    void update(Item item);

    void delete(Long id);

    List<Item> getAll();
}
