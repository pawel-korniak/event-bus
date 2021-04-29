package com.github.pawelkorniak.subjects;

import com.github.pawelkorniak.board.BoardToCheck;
import rx.subjects.PublishSubject;

public interface BoardSubjectProducer {
    PublishSubject<BoardToCheck> publisher = BoardSubject.getInstance();

    default void publish(BoardToCheck board){
        publisher.onNext(board);
    }
}
