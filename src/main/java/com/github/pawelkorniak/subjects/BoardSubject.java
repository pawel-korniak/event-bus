package com.github.pawelkorniak.subjects;

import com.github.pawelkorniak.board.BoardToCheck;
import rx.subjects.PublishSubject;

public class BoardSubject {
    private static final PublishSubject<BoardToCheck> publisher = PublishSubject.create();

    private BoardSubject() {
    }

    public static synchronized PublishSubject<BoardToCheck> getInstance() {
        return publisher;
    }
}
