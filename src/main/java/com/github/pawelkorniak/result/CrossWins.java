package com.github.pawelkorniak.result;

import com.github.pawelkorniak.game.Game;

class CrossWins implements Result {

    @Override
    public Game.Sign getSign() {
        return Game.Sign.X;
    }
}
