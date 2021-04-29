package com.github.pawelkorniak.game;

import com.github.pawelkorniak.player.Player;
import com.github.pawelkorniak.result.Result;

public class SimpleScoring implements Scoring {



    @Override
    public Result countPoints(Player player) {

        return Result.getResult(player.compare());
    }
}
