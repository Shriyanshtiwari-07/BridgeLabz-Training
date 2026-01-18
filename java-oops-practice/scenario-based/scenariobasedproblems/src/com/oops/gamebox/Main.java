package com.oops.gamebox;

public class Main{
    public static void main(String[] args) {

        Game arcade = new ArcadeGame("Speed Racer", 9.99, 4.5);
        Game strategy = new StrategyGame("War Tactics", 14.99, 4.8);

        arcade.download();
        arcade.playDemo();

        strategy.download();
        strategy.playDemo();

        Game discountedGame = arcade.applyDiscount(20);
        System.out.println("Discounted Price: $" + discountedGame.getPrice());

        User user = new User("Alex");
        user.buyGame(arcade);
        user.buyGame(strategy);
    }
}