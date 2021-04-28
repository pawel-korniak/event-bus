package com.github.pawelkorniak.consumer;

import com.github.pawelkorniak.bus.EventProducer;
import com.github.pawelkorniak.game.BoardToCheck;
import com.github.pawelkorniak.result.Result;
import rx.Observer;

public interface Auditor extends Observer, EventProducer {
    static Auditor getAuditor(){
        return new SimpleAuditor();
    }

    Result checkBoard(BoardToCheck board);
}
