package com.github.pawelkorniak.game;

import com.github.pawelkorniak.board.BoardToCheck;
import com.github.pawelkorniak.subjects.BoardSubject;
import com.github.pawelkorniak.subjects.BusSubject;
import com.github.pawelkorniak.audit.Auditor;
import com.github.pawelkorniak.subjects.GameSubject;
import com.github.pawelkorniak.consumer.OutputInterface;
import com.github.pawelkorniak.player.Player;
import com.github.pawelkorniak.result.Result;
import com.github.pawelkorniak.subjects.GameSubjectProducer;
import rx.subjects.PublishSubject;

public class Game implements GameSubjectProducer {


    public static final String PROP = "console";



    public Game(String[] args) {

    }

    public Result play() {

        PublishSubject bus = BusSubject.getInstance();

        final OutputInterface printer = OutputInterface.getInterface(PROP);
        final MyLogger logger = new MyLogger();

        bus.subscribe(printer);
        bus.subscribe(logger);

        final Auditor boardAuditor = Auditor.getBoardAuditor();
        PublishSubject<BoardToCheck> boardSubject = BoardSubject.getInstance();
        boardSubject.subscribe(boardAuditor);
        BoardToCheck board = BoardToCheck.getBoard();

        final Auditor gameAuditor = Auditor.getBoardAuditor();
        PublishSubject<Player> gameSubject = GameSubject.getInstance();
        gameSubject.subscribe(player);

        bus.onNext(123);
        bus.onNext("asd");
        bus.onNext(board);

        return null;
    }

    public enum Sign {
        X,O,T
    }
}
