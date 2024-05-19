package com.example.mustafo.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/book")

public class BookController implements BookInterface<Integer, Book> {
    @Autowired
    private BookServicssimple bookServicssimple;

    @PostMapping("create")
    @Override
    public Book create(@RequestBody Book book) {
        return bookServicssimple.create(book);
    }

    @GetMapping("get")
    @Override
    public Book get(@RequestParam Integer id) {
        return bookServicssimple.get(id);
    }

    @PutMapping("update")
    @Override
    public Book update(@RequestParam Integer id) {
        return bookServicssimple.update(id);
    }

    @DeleteMapping("delete")
    @Override
    public Book delete(@RequestParam Integer id) {
        return bookServicssimple.delete(id);
    }

    @GetMapping("getAll")
    @Override
    public List<Book> getAll() {
        return bookServicssimple.getAll();
    }
}
