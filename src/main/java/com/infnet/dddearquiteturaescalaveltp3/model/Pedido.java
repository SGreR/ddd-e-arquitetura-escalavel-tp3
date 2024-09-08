package com.infnet.dddearquiteturaescalaveltp3.model;

import com.infnet.dddearquiteturaescalaveltp3.commands.CriarPedidoCommand;
import com.infnet.dddearquiteturaescalaveltp3.enums.StatusPedido;
import com.infnet.dddearquiteturaescalaveltp3.events.*;
import jakarta.persistence.*;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import java.util.List;

import static org.axonframework.modelling.command.AggregateLifecycle.apply;

@Aggregate
@Entity
public class Pedido {
    @AggregateIdentifier
    @Id
    private Long pedidoId;
    private Long clienteId;
    @ElementCollection
    private List<Item> itens;
    private double valorTotal;
    @Enumerated(EnumType.STRING)
    private StatusPedido statusPedido;

    public Pedido() {
    }

    @CommandHandler
    public Pedido(CriarPedidoCommand command) {
        apply(new PedidoCriadoEvent(command.getIdAgregado(), command.getClienteId(), command.getItens(), command.getValorTotal()));
    }

    @EventSourcingHandler
    public void on(PedidoCriadoEvent event) {
        this.pedidoId = event.getPedidoId();
        this.clienteId = event.getClienteId();
        this.itens = event.getItens();
        this.valorTotal = event.getValorTotal();
        this.statusPedido = StatusPedido.REALIZADO;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public List<Item> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }
}
