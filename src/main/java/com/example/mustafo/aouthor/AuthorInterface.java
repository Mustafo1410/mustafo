package com.example.mustafo.aouthor;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AuthorInterface<K, V> {
    V create(V dto);

    V update(K id, V dto);

    V delete(K id);

    V get(K id);

    List<V> getAll();

    V getAllWithBooks(K id);


}
