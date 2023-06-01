package org.example.domain.player;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    Integer id;
    String name;
    //Deck
    boolean isActive;

    public Player(Integer id, String name){
        this.id = id;
        this.name = name;
    }
}
