package com.github.pawelkorniak.player;

import com.github.pawelkorniak.game.Game;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class HumanPlayer implements Player{
    private Player nextPlayer;
    private Game.Sign sign;
    private int score;

    public HumanPlayer(Game.Sign sign) {

        this.sign = sign;
    }

    public HumanPlayer(Game.Sign sign, HumanPlayer nextPlayer) {

        this.sign = sign;
        this.nextPlayer = nextPlayer;
    }

    @Override
    public Game.Sign compare() {

        var list = List.of(this,nextPlayer);

        final Optional<Player> player = Optional.of(Collections.max(list));
        if (player.isPresent()){
            return player.get().getSign();
        }
        return Game.Sign.T;
    }

    @Override
    public Game.Sign getSign() {
        return sign;
    }

    @Override
    public Move makeMove() {
        return new Move(1,1);
    }

    @Override
    public Player getNextPlayer() {
        return nextPlayer;
    }

    @Override
    public int compareTo(Object o) {
        var p = (Player) o;
        return this.score - p.score;
    }
}
