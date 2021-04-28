package com.github.pawelkorniak.result;

import com.github.pawelkorniak.game.Game;

import java.util.Map;

public interface Result {
    static Result getResult(Game.Sign sign){
        Map<Game.Sign,Result> map = Map.of(
                Game.Sign.X,new CrossWins(),
                Game.Sign.O,new NaughtWins(),
                Game.Sign.T,new Tie());
        return map.getOrDefault(sign, new KeepPlaying());
    }

    Game.Sign getSign();
}
