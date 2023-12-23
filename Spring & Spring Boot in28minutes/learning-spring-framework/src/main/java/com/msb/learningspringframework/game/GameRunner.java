package com.msb.learningspringframework.game;

public class GameRunner {
    private final GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void runGame() {
        System.out.printf("Running game: %s%n", game);
        System.out.println("Game is running...");
        game.up();
        game.down();
        game.left();
        game.right();

    }
}
