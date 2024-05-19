package com.example.mustafo.aouthor;

import com.example.mustafo.books.Book;
import com.example.mustafo.books.BookServicssimple;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServicesimpler implements AuthorInterface<Integer,Author> {
    private final BookServicssimple bookServicssimple;
    List<Author> authorList = new ArrayList<>();
    Integer authorId = 1;

    @Override
    public Author create(Author dto) {
        Author author = Author.builder()
                .id(authorId)
                .name(dto.getName())
                .surname(dto.getSurname())
                .age(dto.getAge())
                .build();
        authorList.add(author);
        authorId++;
        return author;
    }

    @Override
    public Author update(Integer id, Author dto) {
        for (Author author : authorList) {
            if (author.getId().equals(id)) {
                author.setName(dto.getName());
                author.setSurname(dto.getSurname());
                author.setAge(dto.getAge());
                author.setId(id);
                return author;
            }

        }
        return new Author();
    }

    @Override
    public Author delete(Integer id) {
        for (Author author : authorList) {
            if (author.getId().equals(id)) {
                authorList.remove(author);
                return author;
            }

        }
        return new Author();
    }

    @Override
    public Author get(Integer id) {
        for (Author author : authorList) {
            if (author.getId().equals(id)) {
                return author;
            }

        }
        return new Author();
    }

    @Override
    public List<Author> getAll() {
        return authorList;
    }

    @Override
    public Author getAllWithBooks(Integer id) {
        List<Book> books = new ArrayList<>();
        for (Author author : authorList) {
            if (author.getId().equals(id)) {
                for (Book book : this.bookServicssimple.getAll())
                    if (book.getAuthorId().equals(id)) {
                    books.add(book);
                }
            }
            author.setBooks(books);
            return author;
        }
        return new Author();
    }

}
