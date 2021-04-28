package com.github.pawelkorniak.bus;

public interface EventConsumer<T> {
    void consumeEvent(T event );
}
