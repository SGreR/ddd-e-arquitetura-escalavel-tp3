package com.infnet.dddearquiteturaescalaveltp3.commands;

import com.infnet.dddearquiteturaescalaveltp3.model.Item;

import java.util.List;
import java.util.UUID;

public class BasePedidoCommand extends BaseCommand<Long> {
    Long clienteId;
    List<Item> itens;
    double valorTotal;

    public BasePedidoCommand(Long idAgregado) {
        super(idAgregado);
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
