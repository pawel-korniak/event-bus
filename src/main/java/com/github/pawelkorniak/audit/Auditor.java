package com.github.pawelkorniak.audit;

import com.github.pawelkorniak.subjects.BusSubjectProducer;
import rx.Observer;

public interface Auditor extends Observer, BusSubjectProducer {
    static Auditor getBoardAuditor(){
        return new BoardAuditor();
    }
    static Auditor getGameAuditor(){
        return new GameAuditor();
    }

}
