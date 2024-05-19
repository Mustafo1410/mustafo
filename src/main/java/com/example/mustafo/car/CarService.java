package com.example.mustafo.car;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CarService<K,V>{
    V create(V car);
    V get(K id);
    V update(K id);
    V delete(K id);
    List<V> getAll();

}
