package com.github.pawelkorniak.game;

import com.github.pawelkorniak.bus.Subject;
import com.github.pawelkorniak.consumer.Auditor;
import com.github.pawelkorniak.consumer.OutputInterface;
import com.github.pawelkorniak.result.Result;
import rx.subjects.PublishSubject;

public class Game {


    public static final String PROP = "console";

    public Game(String[] args) {

    }

    public Result play() {

        PublishSubject subject = Subject.getInstance();

        final Auditor auditor = Auditor.getAuditor();
        final OutputInterface printer = OutputInterface.getInterface(PROP);
        final MyLogger logger = new MyLogger();

        subject.subscribe(auditor);
        subject.subscribe(printer);
        subject.subscribe(logger);

        subject.onNext(123);
        subject.onNext("asd");
        BoardToCheck board = new BoardToCheckBySimpleAuditor();
        subject.onNext(board);

        return null;
    }

    public enum Sign {
        X,O,T
    }
}
