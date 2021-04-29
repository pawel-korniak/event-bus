package com.github.pawelkorniak.player;

public class HumanPlayer implements Player{
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public Move makeMove() {
        return new Move(1,1);
    }
}
