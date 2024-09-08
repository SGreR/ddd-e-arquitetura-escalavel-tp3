package com.infnet.dddearquiteturaescalaveltp3.events;

import org.springframework.lang.NonNull;
import java.time.Instant;

public abstract class BaseEvent<T> implements DomainObject{

    @NonNull
    private final T idEvento;
    @NonNull
    private final Instant timestamp;

    public BaseEvent(T id) {
        this.idEvento = id;
        this.timestamp = Instant.now();
    }

    @NonNull
    public T getIdEvento() {
        return idEvento;
    }

    @NonNull
    public Instant getTimestamp() {
        return timestamp;
    }
}
