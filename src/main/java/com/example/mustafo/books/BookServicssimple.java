package com.example.mustafo.books;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServicssimple implements BookInterface<Integer,Book>{
    List<Book>  bookList = new ArrayList<>();


    @Override
    public Book create(Book book) {
        book= Book.builder()
                .id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .price(book.getPrice())
                .authorId(book.getAuthorId())
                .build();
       bookList.add(book);

        return book;
    }

    @Override
    public Book get(Integer id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                return book;
            }

        }
        return new Book();
    }

    @Override
    public Book update(Integer id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                book.setTitle(book.getTitle());
                book.setAuthor(book.getAuthor());
                book.setPrice(book.getPrice());
                return book;
            }

        }
        return bookList.get(0);
    }

    @Override
    public Book delete(Integer id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                bookList.remove(book);
                return bookList.get(0);
            }

        }
        return new Book();
    }

    @Override
    public List<Book> getAll() {
        return bookList;
    }
}
