package com.github.pawelkorniak;

import com.github.pawelkorniak.game.Game;
import com.github.pawelkorniak.result.Result;

class Main {
    public static void main(String[] args) {

        Game game = new Game(args);
        Result finalResult = game.play();

    }
}
