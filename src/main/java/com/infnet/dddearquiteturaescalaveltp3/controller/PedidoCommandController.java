package com.infnet.dddearquiteturaescalaveltp3.controller;

import com.infnet.dddearquiteturaescalaveltp3.model.Pedido;
import com.infnet.dddearquiteturaescalaveltp3.service.PedidoCommandService;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/pedidos")
public class PedidoCommandController {
    private final PedidoCommandService pedidoCommandService;

    public PedidoCommandController(PedidoCommandService pedidoCommandService) {
        this.pedidoCommandService = pedidoCommandService;
    }

    @PostMapping("/criar")
    public CompletableFuture<String> criarPedido(@RequestBody Pedido pedido) {
        return pedidoCommandService.criarPedido(pedido);
    }
}


