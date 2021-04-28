package com.github.pawelkorniak.consumer;

import com.github.pawelkorniak.game.BoardToPrint;
import com.github.pawelkorniak.result.Result;
import rx.Observer;

import java.util.function.Consumer;

class Printer implements OutputInterface{

    Consumer<String> stringConsumer = System.out::println;

    @Override
    public void onCompleted() {
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onNext(Object event) {
        if(event instanceof String text){
            stringConsumer.accept("printer : " + text);
        } if (event instanceof Result result){
            stringConsumer.accept("printer : Result : " + result.getSign());
        } if (event instanceof BoardToPrint board){
            stringConsumer.accept(board.printBoard());
        }
    }

    @Override
    public void print(Object object) {
        stringConsumer.accept(object.toString());

    }
}
