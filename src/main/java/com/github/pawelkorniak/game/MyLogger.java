package com.github.pawelkorniak.game;

import rx.Observer;

import java.util.function.Consumer;

class MyLogger implements Observer {

    Consumer<String> stringConsumer = System.out::println;

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onNext(Object event) {
        stringConsumer.accept("<LOG>\n" + event.toString() + "\n</LOG>");
    }
}
