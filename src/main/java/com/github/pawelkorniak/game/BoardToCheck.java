package com.github.pawelkorniak.game;

public class BoardToCheck implements Board{

    @Override
    public Sign getWinner() {
        return Sign.X;
    }
}
