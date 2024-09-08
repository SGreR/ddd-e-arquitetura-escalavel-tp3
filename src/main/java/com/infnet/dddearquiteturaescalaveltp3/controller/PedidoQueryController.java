package com.infnet.dddearquiteturaescalaveltp3.controller;

import com.infnet.dddearquiteturaescalaveltp3.model.Pedido;
import com.infnet.dddearquiteturaescalaveltp3.service.PedidoQueryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoQueryController {
    private final PedidoQueryService pedidoQueryService;

    public PedidoQueryController(PedidoQueryService pedidoQueryService) {
        this.pedidoQueryService = pedidoQueryService;
    }

    @GetMapping("/{id}/eventos")
    public List<Object> listarEventos(@PathVariable Long id) {
        return pedidoQueryService.listarEventos(id);
    }

    @GetMapping("/{id}")
    public Pedido obterPorId(@PathVariable Long id) {
        return pedidoQueryService.obterPorId(id).get();
    }
}

