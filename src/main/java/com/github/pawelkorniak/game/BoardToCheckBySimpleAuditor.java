package com.github.pawelkorniak.game;

class BoardToCheckBySimpleAuditor implements BoardToCheck {

    @Override
    public BoardToPrint getBoardToPrint() {
        return new BoardToPrintInConsole(this.toString());
    }

    @Override
    public Game.Sign getWinner() {
        return Game.Sign.X;
    }

    @Override
    public String toString() {
        return """
            _______
            | | | |
            -------
            | | | |
            -------
            | | | |
            -------
            """;
    }
}



