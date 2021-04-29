package com.github.pawelkorniak.game;

import com.github.pawelkorniak.board.BoardToCheck;
import com.github.pawelkorniak.round.Round;
import com.github.pawelkorniak.subjects.BoardSubject;
import com.github.pawelkorniak.subjects.BusSubject;
import com.github.pawelkorniak.audit.Auditor;
import com.github.pawelkorniak.subjects.GameSubject;
import com.github.pawelkorniak.consumer.OutputInterface;
import com.github.pawelkorniak.player.Player;
import com.github.pawelkorniak.result.Result;
import com.github.pawelkorniak.subjects.GameSubjectProducer;
import rx.subjects.PublishSubject;

import java.util.Map;

public class Game implements GameSubjectProducer {

    public static final String PROP = "console";
    public static final Sign STARTING_SIGN = Sign.O;

    public Game(String[] args) {
    }

    public Result play() {

        PublishSubject bus = BusSubject.getInstance();

        final OutputInterface printer = OutputInterface.getInterface(PROP);
        final MyLogger logger = new MyLogger();

        bus.subscribe(printer);
        bus.subscribe(logger);



        final Auditor gameAuditor = Auditor.getGameAuditor();
        PublishSubject<Player> gameSubject = GameSubject.getInstance();
        gameSubject.subscribe(gameAuditor);

        Player player = Player.getHumanPlayer(STARTING_SIGN);
        gameSubject.onNext(player);

        Scoring scroring = Scoring.getScoring();
        Round round = new Round(1);
        Result matchResult;
        do {
            round = round.next(player);
            matchResult = scroring.countPoints(player);
            gameSubject.onNext(player);
        } while (matchResult == null);



//        bus.onNext(123);
//        bus.onNext("asd");


        return null;
    }

    public enum Sign {
        X,O,T;
        public Sign other(Sign sign){
            if(sign.equals(Sign.O)) return Sign.X;
            return Sign.O;
        }
    }
}
