package com.example.mustafo.car;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/car/")
@RequiredArgsConstructor
public class CarController implements CarService<Integer, Car> {

    private final CarServiceSimple carServiceSimple;


    @PostMapping("/create")
    @Override
    public Car create(@RequestBody Car car) {
        return carServiceSimple.create(car);
    }

    @GetMapping("/get")
    @Override
    public Car get(@RequestParam Integer id) {
        return carServiceSimple.get(id);
    }

    @PutMapping("/update")
    @Override
    public Car update(@RequestParam Integer id) {
        return carServiceSimple.update(id);
    }

    @DeleteMapping("/delete")
    @Override
    public Car delete(@RequestParam Integer id) {
        return carServiceSimple.delete(id);
    }

    @GetMapping("/getAll")
    @Override
    public List<Car> getAll() {
        return List.of();
    }
}
