package edu.icet.demo.controller;

import edu.icet.demo.dto.Item;
import edu.icet.demo.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("item")
@CrossOrigin
public class ItemController {

    final ItemService service;

    @PostMapping("add")
    public void save(@RequestBody Item item){
        service.save(item);
    }

    @PostMapping("update")
    public void update(@RequestBody Item item){
        service.update(item);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("getAll")
    public List<Item> getAll(){
        return service.getAll();
    }
}
