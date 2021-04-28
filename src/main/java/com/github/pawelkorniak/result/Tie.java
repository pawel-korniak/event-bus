package com.github.pawelkorniak.result;

import com.github.pawelkorniak.game.Game;

class Tie implements Result{
    @Override
    public Game.Sign getSign() {
        return Game.Sign.T;
    }
}
