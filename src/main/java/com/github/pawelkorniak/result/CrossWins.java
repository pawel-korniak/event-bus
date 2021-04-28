package com.github.pawelkorniak.result;

import com.github.pawelkorniak.game.Sign;

public class CrossWins implements Result {

    @Override
    public Sign getSign() {
        return Sign.X;
    }
}
