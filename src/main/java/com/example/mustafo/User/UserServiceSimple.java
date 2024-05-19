package com.example.mustafo.User;


import com.example.mustafo.card.Card;
import com.example.mustafo.card.Cardservicesimple;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceSimple implements UserInterface<Integer, User> {
    private final Cardservicesimple cardservicesimple;
    List<User> userList = new ArrayList<>();
    Integer userId = 1;

    @Override
    public User create(User dto) {
        User user = User.builder()
                .id(userId)
                .name(dto.getName())
                .age(dto.getAge())
                .build();
        userList.add(user);
        userId++;
        return user;
    }

    @Override
    public User update(Integer id, User dto) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                user.setName(dto.getName());
                user.setAge(dto.getAge());
                user.setId(id);
                return user;
            }
        }
        return new User();
    }

    @Override
    public User delete(Integer id) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                userList.remove(user);
                return user;
            }
        }
        return new User();
    }

    @Override
    public User get(Integer id) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return new User();
    }

    @Override
    public List<User> getAll() {
        return userList;
    }

    @Override
    public User getUserWithCards(Integer id) {
        List<Card> cards = new ArrayList<>();
        for (User user : userList) {
            if (user.getId().equals(id)) {
                for (Card card : this.cardservicesimple.getAll()) {
                    if (card.getUserId().equals(id)) {
                        cards.add(card);
                    }
                }
                user.setCards(cards);
                return user;
            }
        }
        return new User();
    }

    @Override
    public List<Integer> getAllAges() {
        List<Integer> ages = new ArrayList<>();
        for (User user : userList) {
            ages.add(user.getAge());
        }
        return ages;
    }

    @Override
    public List<SubUser> getAllSubUsers() {
        List<SubUser> subUsers = new ArrayList<>();
        SubUser subUser;
        for (User user : userList) {
            subUser = SubUser.builder()
                    .name(user.getName())
                    .age(user.getAge())
                    .build();
            subUsers.add(subUser);
        }
        return subUsers;
    }
}



