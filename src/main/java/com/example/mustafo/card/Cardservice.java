package com.example.mustafo.card;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface Cardservice<K,V> {
    V create(V card);

    V get(K id);

    V update(K id);

    V delete(K id);
    List<V> getAll();


}
