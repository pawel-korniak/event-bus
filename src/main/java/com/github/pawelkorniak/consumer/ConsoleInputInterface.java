package com.github.pawelkorniak.consumer;

import java.util.Scanner;
import java.util.function.Supplier;

class ConsoleInputInterface implements InputInterface{

    private Supplier<String> scanner = new Scanner(System.in)::nextLine;

    @Override
    public String getInput() {
        return scanner.get();
    }
}
