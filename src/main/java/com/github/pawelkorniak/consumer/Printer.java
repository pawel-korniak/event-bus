package com.github.pawelkorniak.consumer;

import com.github.pawelkorniak.bus.EventConsumer;
import com.github.pawelkorniak.game.BoardToPrint;
import com.github.pawelkorniak.result.Result;

import java.util.function.Consumer;

public class Printer implements EventConsumer {

    Consumer<String> stringConsumer = System.out::println;

    @Override
    public void consumeEvent(Object event) {
        if(event instanceof String text){
            stringConsumer.accept("printer : " + text);
        } if (event instanceof Result result){
            stringConsumer.accept("printer : Result : " + result.getSign());
        } if (event instanceof BoardToPrint board){
            stringConsumer.accept(board.printBoard());
        }
    }
}
