package com.github.pawelkorniak.bus;

public interface EventProducer<T> {

    Bus bus = Bus.getInstance();

    default void send(T data){
        bus.send(data);
    }
}
