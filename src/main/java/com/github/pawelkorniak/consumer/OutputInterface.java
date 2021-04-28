package com.github.pawelkorniak.consumer;

import rx.Observer;

import java.util.Map;

public interface OutputInterface extends Observer {

    static OutputInterface getInterface(String prop){
        Map<String,OutputInterface> mapOfInterfaces = Map.of(
                "console",new Printer()
        );
        return mapOfInterfaces.getOrDefault(prop,new Printer());
    }

    void print(Object object);

}
