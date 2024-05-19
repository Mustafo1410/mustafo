package com.example.mustafo.card;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Cardservicesimple implements Cardservice <Integer,Card>{
    List<Card> cardList = new ArrayList<>();

    @Override
    public Card create(Card card) {
        card= Card.builder()
                .id(card.getId())
                .money(card.getMoney())
                .name(card.getName())
                .password(card.getPassword())
                .userId(card.getUserId())
                .build();
        cardList.add(card);
        return card;
    }

    @Override
    public Card get(Integer id) {
        for (Card card : cardList) {
            if (card.getId().equals(id)) {

                return card;
            }
        }
        return new Card();
    }

    @Override
    public Card update(Integer id) {
        for (Card card : cardList) {
            if (card.getId().equals(id)) {
                card.setId(id);
                card.setName(card.getName());
                card.setMoney(card.getMoney());
                card.setPassword(card.getPassword());
            }

        }
        return cardList.get(0);}

    @Override
    public Card delete(Integer id) {
        cardList.removeIf(card -> card.getId().equals(id));
        return cardList.get(0);
    }

    @Override
    public List<Card> getAll() {
        return cardList;
    }
}


