package com.infnet.dddearquiteturaescalaveltp3.events;

import com.infnet.dddearquiteturaescalaveltp3.model.Item;

import java.util.List;

public class PedidoCriadoEvent extends BasePedidoEvent {

    public PedidoCriadoEvent(Long pedidoId, Long clienteId, List<Item> itens, double valorTotal) {
        super();
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
        this.itens = itens;
        this.valorTotal = valorTotal;
    }
}


