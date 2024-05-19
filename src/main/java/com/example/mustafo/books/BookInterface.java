package com.example.mustafo.books;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookInterface <K,V> {
    V create( V value);
    V get( K id);
    V update( K id );
    V delete( K id);
    List<V> getAll();


}
