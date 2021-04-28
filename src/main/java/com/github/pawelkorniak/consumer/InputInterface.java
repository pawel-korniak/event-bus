package com.github.pawelkorniak.consumer;

import java.util.Map;

public interface InputInterface {

    static InputInterface getInterface(String prop){
        Map<String,InputInterface> mapOfInterfaces = Map.of(
                "console",new ConsoleInputInterface()
        );
        return mapOfInterfaces.getOrDefault(prop,new ConsoleInputInterface());
    }

    String getInput();
}
