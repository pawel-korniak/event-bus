package com.github.pawelkorniak;

import com.github.pawelkorniak.game.Game;

class Main {
    public static void main(String[] args) {

        Game game = new Game(args);
        game.play();

    }
}
