package com.github.pawelkorniak.subjects;

import com.github.pawelkorniak.player.Player;
import rx.subjects.PublishSubject;

public class GameSubject {
    private static final PublishSubject<Player> publisher = PublishSubject.create();

    private GameSubject() {
    }

    public static synchronized PublishSubject<Player> getInstance() {
        return publisher;
    }
}
