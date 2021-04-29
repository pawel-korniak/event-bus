package com.github.pawelkorniak.board;

import com.github.pawelkorniak.subjects.BoardSubjectProducer;
import com.github.pawelkorniak.game.Game;

class BoardToCheckBySimpleAuditor implements BoardToCheck , BoardSubjectProducer {

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



