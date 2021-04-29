package com.github.pawelkorniak.round;

import com.github.pawelkorniak.audit.Auditor;
import com.github.pawelkorniak.board.BoardToCheck;
import com.github.pawelkorniak.player.Player;
import com.github.pawelkorniak.result.Result;
import com.github.pawelkorniak.subjects.BoardSubject;
import rx.subjects.PublishSubject;

public class Round {

    private int roundNumber;

    public Round(int roundNumber) {

        this.roundNumber = roundNumber;
    }

    public Round next(Player player){

        final Auditor boardAuditor = Auditor.getBoardAuditor();
        PublishSubject<BoardToCheck> boardSubject = BoardSubject.getInstance();
        boardSubject.subscribe(boardAuditor);

        BoardToCheck board = BoardToCheck.getBoard();

        Result result;
        do {
            player.makeMove();
            boardSubject.onNext(board);
            result = Result.getResult(board.getWinner());
        } while (result == null);

        return new Round(roundNumber++);


    }

}
