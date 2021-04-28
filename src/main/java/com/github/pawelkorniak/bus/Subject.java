package com.github.pawelkorniak.bus;

import rx.subjects.PublishSubject;

public class Subject {

    private static final PublishSubject publisher = PublishSubject.create();

    private Subject() {
    }

    public static synchronized PublishSubject getInstance() {
        return publisher;
    }
}
