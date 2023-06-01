package org.example.domain.game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.domain.player.Player;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameManager {
    Integer noOfPlayers;
    List<Player> players;
    Player currentPlayer;
}
