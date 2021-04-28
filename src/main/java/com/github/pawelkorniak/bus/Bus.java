package com.github.pawelkorniak.bus;

import java.util.ArrayList;
import java.util.List;

public class Bus<T>{

    private static final Bus instance = new Bus();

    private Bus() {
    }

    public static synchronized Bus getInstance() {
        return instance;
    }

    private List<EventConsumer> list = new ArrayList<>();

    public void send(T data){
        list.stream().parallel().forEach(eventConsumer -> eventConsumer.consumeEvent(data));
    }

    public void subscribe(EventConsumer eventConsumer) {
        list.add(eventConsumer);
    }
}
