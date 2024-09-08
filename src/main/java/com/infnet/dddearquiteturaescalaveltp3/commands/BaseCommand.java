package com.infnet.dddearquiteturaescalaveltp3.commands;

import com.infnet.dddearquiteturaescalaveltp3.events.DomainObject;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class BaseCommand<T> implements DomainObject {
    @TargetAggregateIdentifier
    private final T idAgregado;

    public BaseCommand(T idAgregado) {
        this.idAgregado = idAgregado;
    }

    public T getIdAgregado() {
        return idAgregado;
    }
}
