package com.github.pawelkorniak.board;

import com.github.pawelkorniak.game.Game;
import com.github.pawelkorniak.subjects.BoardSubjectProducer;

public interface BoardToCheck extends BoardSubjectProducer {
    static BoardToCheck getBoard(){
        return new BoardToCheckBySimpleAuditor();
    }
    BoardToPrint getBoardToPrint();
    Game.Sign getWinner();
    String boardToString();
}
