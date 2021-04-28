package com.github.pawelkorniak.consumer;

import com.github.pawelkorniak.bus.EventConsumer;
import com.github.pawelkorniak.bus.EventProducer;
import com.github.pawelkorniak.game.Board;
import com.github.pawelkorniak.game.BoardToPrint;
import com.github.pawelkorniak.game.Sign;
import com.github.pawelkorniak.result.Result;

public class Audit implements EventConsumer, EventProducer {

    Result checkBoard(Board board){
        // some logic that check if is any winner
        Sign sign = board.getWinner();
        return Result.getResult(sign);
    }

    @Override
    public void consumeEvent(Object event) {
        if(event instanceof Integer number){
            //System.out.println("auditor : " + number);
        } else if (event instanceof Board board){
            send(checkBoard(board));
            send(new BoardToPrint());
        }
    }
}
