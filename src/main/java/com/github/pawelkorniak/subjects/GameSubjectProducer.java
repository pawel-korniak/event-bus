package com.github.pawelkorniak.subjects;

import com.github.pawelkorniak.player.Player;
import rx.subjects.PublishSubject;

public interface GameSubjectProducer {
    PublishSubject<Player> publisher = GameSubject.getInstance();

    default void publish(Player player){
        publisher.onNext(player);
    }
}
