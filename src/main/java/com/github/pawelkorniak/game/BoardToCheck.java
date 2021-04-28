package com.github.pawelkorniak.game;

public interface BoardToCheck {
    static BoardToCheck getBoard(){
        return new BoardToCheckBySimpleAuditor();
    }
    BoardToPrint getBoardToPrint();
    Game.Sign getWinner();
    String toString();
}
