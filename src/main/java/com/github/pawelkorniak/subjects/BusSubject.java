package com.github.pawelkorniak.subjects;

import rx.subjects.PublishSubject;

public class BusSubject {

    private static final PublishSubject publisher = PublishSubject.create();

    private BusSubject() {
    }

    public static synchronized PublishSubject getInstance() {
        return publisher;
    }
}
