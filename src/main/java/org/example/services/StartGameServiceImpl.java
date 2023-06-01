package org.example.services;

import lombok.NoArgsConstructor;
import org.example.domain.game.GameManager;
import org.example.domain.player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@NoArgsConstructor
public class StartGameServiceImpl implements StartGameService{

    private Scanner sc= new Scanner(System.in);

    @Override
    public void registerPlayers(){
        GameManager gameManager = new GameManager();

        System.out.println("Enter Number of Players:");
        Integer noOfPlayers = Integer.valueOf(sc.nextLine());
        gameManager.setNoOfPlayers(noOfPlayers);

        List<Player> players = new ArrayList<>();
        for(int i=0;i< gameManager.getNoOfPlayers();i++){
            System.out.println("Enter Player " + (i+1) + " name:");
            String playerName = sc.nextLine();
            players.add(new Player(i,playerName));
        }
        gameManager.setPlayers(players);
    }
}
