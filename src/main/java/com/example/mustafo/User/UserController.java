package com.example.mustafo.User;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController implements UserInterface<Integer, User> {
    private final UserServiceSimple userServiceSimple;

    @Override
    @PostMapping("/create")
    public User create(@RequestBody User dto) {
        return this.userServiceSimple.create(dto);
    }

    @Override
    @PutMapping("/update/{id}")
    public User update(@PathVariable("id") Integer id, @RequestBody User dto) {
        return this.userServiceSimple.update(id, dto);
    }

    @Override
    @DeleteMapping("/delete")
    public User delete(@RequestParam Integer id) {
        return this.userServiceSimple.delete(id);
    }

    @Override
    @GetMapping("/get")
    public User get(@RequestParam Integer id) {
        return this.userServiceSimple.get(id);
    }

    @Override
    @GetMapping("/getAll")
    public List<User> getAll() {
        return this.userServiceSimple.getAll();
    }

    @Override
    @GetMapping("/getUsersWithCards")
    public User getUserWithCards(@RequestParam Integer id) {
        return this.userServiceSimple.getUserWithCards(id);
    }

    @Override
    @GetMapping("/getAllAges")
    public List<Integer> getAllAges() {
        return this.userServiceSimple.getAllAges();
    }

    @Override
    @GetMapping("/subUser")
    public List<SubUser> getAllSubUsers() {
        return this.userServiceSimple.getAllSubUsers();
    }
}

