package com.infnet.dddearquiteturaescalaveltp3.service;

import com.infnet.dddearquiteturaescalaveltp3.commands.CriarPedidoCommand;
import com.infnet.dddearquiteturaescalaveltp3.model.Pedido;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class PedidoCommandService {
    private final CommandGateway commandGateway;

    public PedidoCommandService(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    public CompletableFuture<String> criarPedido(Pedido pedido) {
        return commandGateway.send(new CriarPedidoCommand(
                pedido.getPedidoId(),
                pedido.getClienteId(),
                pedido.getItens(),
                pedido.getValorTotal()));
    }
}
