package com.github.pawelkorniak.player;

import com.github.pawelkorniak.game.Game;

public interface Player extends Comparable{

    static Player getHumanPlayer(Game.Sign sign){
        Player player = new HumanPlayer(sign,new HumanPlayer(sign.other(sign)));
        return player;
    }

    int score = 0;

    Move makeMove();

    Player getNextPlayer();

    Game.Sign compare();

    Game.Sign getSign();
}
