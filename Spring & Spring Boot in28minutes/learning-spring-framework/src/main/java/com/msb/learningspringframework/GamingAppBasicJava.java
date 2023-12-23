package com.msb.learningspringframework;

import com.msb.learningspringframework.game.GameRunner;
import com.msb.learningspringframework.game.MarioGame;
import com.msb.learningspringframework.game.SuperContraGame;

public class GamingAppBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.runGame();
    }
}
