package com.example.mustafo.aouthor;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/author")
public class AuthorController implements AuthorInterface<Integer,  Author> {
    private final AuthorServicesimpler authorServicesimpler;


    @Override
    @PostMapping("create")
    public Author create(@RequestBody Author dto) {
        return this.authorServicesimpler.create(dto);
    }


    @Override
    @PutMapping("/update/{id}")
    public Author update(@PathVariable Integer id, @RequestBody Author dto) {
        return this.authorServicesimpler.update(id, dto);
    }


    @Override
    @DeleteMapping("/delete")
    public Author delete(@RequestParam Integer id) {
        return this.authorServicesimpler.delete(id);
    }

    @Override
    @GetMapping("get")
    public Author get(@RequestParam Integer id) {
        return this.authorServicesimpler.get(id);
    }

    @Override
    @GetMapping("getAll")
    public List<Author> getAll() {
        return this.authorServicesimpler.getAll();
    }

    @Override
    @GetMapping("getAllWithBook")
    public Author getAllWithBooks( @RequestParam Integer id) {
        return this.authorServicesimpler.getAllWithBooks(id);
    }

}

