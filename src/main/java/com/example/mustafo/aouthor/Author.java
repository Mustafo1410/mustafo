package com.example.mustafo.aouthor;

import com.example.mustafo.books.Book;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private List<Book> books;

}
