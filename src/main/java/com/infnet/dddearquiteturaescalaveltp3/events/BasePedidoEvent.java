package com.infnet.dddearquiteturaescalaveltp3.events;

import com.infnet.dddearquiteturaescalaveltp3.model.Item;

import java.util.List;
import java.util.UUID;

public class BasePedidoEvent extends BaseEvent<UUID>{
    Long pedidoId;
    Long clienteId;
    List<Item> itens;
    double valorTotal;

    public BasePedidoEvent() {
        super(UUID.randomUUID());
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
}
