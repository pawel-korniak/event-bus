package com.github.pawelkorniak.game;

import com.github.pawelkorniak.bus.Bus;
import com.github.pawelkorniak.consumer.Audit;
import com.github.pawelkorniak.consumer.Logger;
import com.github.pawelkorniak.consumer.Printer;

public class Game {


    public Game(String[] args) {

    }

    public void play() {


        Bus bus = Bus.getInstance();
        final Audit audit = new Audit();
        final Printer printer = new Printer();
        final Logger logger = new Logger();

        bus.subscribe(audit);
        bus.subscribe(printer);
        bus.subscribe(logger);

        bus.send(123);
        bus.send("asd");
        bus.send(new BoardToCheck());
    }
}
