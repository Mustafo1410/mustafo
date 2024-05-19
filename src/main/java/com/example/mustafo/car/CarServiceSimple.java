package com.example.mustafo.car;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceSimple implements CarService<Integer,Car> {
    List<Car> carList = new ArrayList<>();

    @Override
    public Car create(Car car) {

        car = Car.builder()
                .id(car.getId())
                .name(car.getName())
                .price(car.getPrice())
                .colour(car.getColour())
                .build();
        carList.add(car);
        return car;
    }

    @Override
    public Car get(Integer id) {
        for (Car car : carList){
            if (car.getId().equals(id)){
                return car;
            }
        }
        return new Car();
    }

    @Override
    public Car update(Integer id) {
        for (Car car : carList){
            if (car.getId().equals(id)){
                car.setId(id);
                car.setName(car.getName());
                car.setPrice(car.getPrice());
                car.setColour(car.getColour());

            }
        }
        return carList.get(0);
    }

    @Override
    public Car delete(Integer id) {
        carList.removeIf(car -> car.getId().equals(id));
        return carList.get(0);
    }


    @Override
    public List<Car> getAll() {
        return carList;
    }

}


