package com.example.mustafo.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/card/")
public class CardController implements Cardservice<Integer, Card> {
    @Autowired
    private Cardservicesimple cardservicesimple;


    @PostMapping("/create")
    @Override
    public Card create(@RequestBody Card car) {
        return cardservicesimple.create(car);
    }

    @GetMapping("/get")
    @Override
    public Card get(@RequestParam Integer id) {
        return cardservicesimple.get(id);
    }

    @PutMapping("/update")
    @Override
    public Card update(@RequestParam Integer id) {
        return cardservicesimple.update(id);
    }

    @DeleteMapping("/delete")
    @Override
    public Card delete(@RequestParam Integer id) {
        return cardservicesimple.delete(id);
    }

    @GetMapping("/getAll")
    @Override
    public List<Card> getAll() {
        return this.cardservicesimple.getAll();
    }
}






