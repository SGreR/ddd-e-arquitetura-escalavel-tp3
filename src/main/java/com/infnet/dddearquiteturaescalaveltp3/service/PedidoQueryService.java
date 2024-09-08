package com.infnet.dddearquiteturaescalaveltp3.service;
import com.infnet.dddearquiteturaescalaveltp3.model.Pedido;
import com.infnet.dddearquiteturaescalaveltp3.repository.PedidoRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PedidoQueryService {
    private final EventStore eventStore;
    private final PedidoRepository pedidoRepository;

    public PedidoQueryService(EventStore eventStore, PedidoRepository pedidoRepository) {
        this.eventStore = eventStore;
        this.pedidoRepository = pedidoRepository;
    }

    public List<Object> listarEventos(Long id) {
        return eventStore.readEvents(id.toString(), 0)
                .asStream()
                .map(Message::getPayload).collect(Collectors.toList());
    }

    public Optional<Pedido> obterPorId(Long id) {
        return pedidoRepository.findById(id);
    }
}
