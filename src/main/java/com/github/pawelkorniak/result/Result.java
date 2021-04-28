package com.github.pawelkorniak.result;

import com.github.pawelkorniak.game.Sign;

import java.util.Map;

public interface Result {
    static Result getResult(Sign sign){
        Map<Sign,Result> map = Map.of(Sign.X,new CrossWins());
        return map.get(sign);
    }

    Sign getSign();
}
