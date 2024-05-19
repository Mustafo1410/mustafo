package com.example.mustafo.books;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private Integer id ;
    private String title ;
    private String author;
    private Integer price;
    private Integer authorId;
}
