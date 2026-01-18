package com.oops.gamebox;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Game> ownedGames;

    public User(String username) {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println(username + " purchased " + game.getTitle());
    }

    // Protected access to owned games
    protected List<Game> getOwnedGames() {
        return ownedGames;
    }
}
