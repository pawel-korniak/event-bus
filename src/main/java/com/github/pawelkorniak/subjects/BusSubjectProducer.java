package com.github.pawelkorniak.subjects;

import rx.subjects.PublishSubject;

public interface BusSubjectProducer<T> {

    PublishSubject publisher = BusSubject.getInstance();

    default void publish(T data){
        publisher.onNext(data);
    }
}
