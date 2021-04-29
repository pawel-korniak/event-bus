package com.github.pawelkorniak.board;

import com.github.pawelkorniak.subjects.BoardSubjectProducer;
import com.github.pawelkorniak.game.Game;

import java.util.Random;

class BoardToCheckBySimpleAuditor implements BoardToCheck , BoardSubjectProducer {

    @Override
    public BoardToPrint getBoardToPrint() {
        return new BoardToPrintInConsole(this.boardToString());
    }

    @Override
    public Game.Sign getWinner() {
        Random random = new Random();
        var r = random.nextInt(3);
        return Game.Sign.values()[r];
    }

    @Override
    public String boardToString() {
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



