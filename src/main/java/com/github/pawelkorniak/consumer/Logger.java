package com.github.pawelkorniak.consumer;

import com.github.pawelkorniak.bus.EventConsumer;
import com.github.pawelkorniak.game.BoardToCheck;


import java.util.function.Consumer;

public class Logger implements EventConsumer {

    Consumer<String> stringConsumer = System.out::println;

    @Override
    public void consumeEvent(Object event) {
        if(event instanceof String text){
            stringConsumer.accept("Logger  : Text : " + text);
        } else if(event instanceof Integer number){
            stringConsumer.accept("Logger  : Number : " + number);
        } else if(event instanceof BoardToCheck){
            stringConsumer.accept("Logger  : Checking Board");
        }
    }
}
