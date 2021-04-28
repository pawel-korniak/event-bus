package com.github.pawelkorniak.result;

import com.github.pawelkorniak.game.Game;

class NaughtWins implements Result{
    @Override
    public Game.Sign getSign() {
        return Game.Sign.O;
    }
}
