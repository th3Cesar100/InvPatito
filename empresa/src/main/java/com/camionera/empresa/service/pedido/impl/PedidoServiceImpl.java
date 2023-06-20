package com.camionera.empresa.service.pedido.impl;

import com.camionera.empresa.entity.Pedido;
import com.camionera.empresa.repository.PedidoRepository;
import com.camionera.empresa.service.pedido.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public List<Pedido> list() {
        return pedidoRepository.findAll();
    }

    @Override
    public void save(Pedido pedido) {
        pedidoRepository.save(pedido);
    }
}
