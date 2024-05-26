package com.msb.learningspringframework;

import com.msb.learningspringframework.game.GameRunner;
import com.msb.learningspringframework.game.MarioGame;
import com.msb.learningspringframework.game.SuperContraGame;

public class App01GamingAppBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
         var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.runGame();
    }
}
