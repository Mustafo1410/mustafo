package com.example.mustafo.card;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private Integer id;
    private String name ;
    private Integer money;
    private String password;
    private Integer userId;
}

