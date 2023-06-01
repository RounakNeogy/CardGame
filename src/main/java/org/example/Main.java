package org.example;

import org.example.services.StartGameService;
import org.example.services.StartGameServiceImpl;

public class Main {
//    private static StartGameService startGameService;
    public static void main(String[] args) {
        System.out.println("Welcome!");

        StartGameService startGameService = new StartGameServiceImpl();
        startGameService.registerPlayers();
    }
}