package com.github.pawelkorniak.bus;

import rx.subjects.PublishSubject;

public interface EventProducer<T> {

    PublishSubject publisher = Subject.getInstance();

    default void publish(T data){
        publisher.onNext(data);
    }
}
