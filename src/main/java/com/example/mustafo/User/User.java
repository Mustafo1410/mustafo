package com.example.mustafo.User;

import com.example.mustafo.card.Card;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private int age;
    private List<Card> cards;
}
