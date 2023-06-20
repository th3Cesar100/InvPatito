package com.camionera.empresa.service.pedido;

import com.camionera.empresa.entity.Pedido;

import java.util.List;

public interface PedidoService {

    List<Pedido> list();

    void save(Pedido pedido);
}
