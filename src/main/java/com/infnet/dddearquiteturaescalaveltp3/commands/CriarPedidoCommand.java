package com.infnet.dddearquiteturaescalaveltp3.commands;

import com.infnet.dddearquiteturaescalaveltp3.model.Item;

import java.util.List;

public class CriarPedidoCommand extends BasePedidoCommand {

    public CriarPedidoCommand(Long idAgregado, Long clienteId, List<Item> itens, double valorTotal) {
        super(idAgregado);
        this.clienteId = clienteId;
        this.itens = itens;
        this.valorTotal = valorTotal;
    }
}



