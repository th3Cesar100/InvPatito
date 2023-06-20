package com.camionera.empresa.service.truckpedido;

import com.camionera.empresa.entity.TruckPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TruckPedidoService {

    List<TruckPedido> list();

    ResponseEntity<?> save(TruckPedido truckPedido);

}
