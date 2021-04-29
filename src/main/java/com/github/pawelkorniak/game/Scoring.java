package com.github.pawelkorniak.game;

import com.github.pawelkorniak.player.Player;
import com.github.pawelkorniak.result.Result;

public interface Scoring {
    static Scoring getScoring(){
        return new SimpleScoring();
    }
    Result countPoints(Player player);
}
