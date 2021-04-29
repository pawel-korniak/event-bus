package com.github.pawelkorniak.audit;

import com.github.pawelkorniak.board.BoardToCheck;
import com.github.pawelkorniak.game.Game;
import com.github.pawelkorniak.result.Result;

class BoardAuditor implements Auditor{


    public Result checkBoard(BoardToCheck board){
        // some logic that check if is any winner
        Game.Sign sign = board.getWinner();
        return Result.getResult(sign);
    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onNext(Object event) {
        if (event instanceof BoardToCheck board){
            publish(checkBoard(board));
            publish(board.getBoardToPrint());
        }

    }
}
