package com.camionera.empresa.service.truckpedido.impl;

import com.camionera.empresa.entity.Pedido;
import com.camionera.empresa.entity.Truck;
import com.camionera.empresa.entity.TruckPedido;
import com.camionera.empresa.repository.PedidoRepository;
import com.camionera.empresa.repository.TruckPedidoRepository;
import com.camionera.empresa.repository.TruckRepository;
import com.camionera.empresa.service.truckpedido.TruckPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckPedidoServiceImpl implements TruckPedidoService {
    @Autowired
    private TruckPedidoRepository truckPedidoRepository;

    @Autowired
    private TruckRepository truckRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public List<TruckPedido> list() {
        return truckPedidoRepository.findAll();
    }

    @Override
    public ResponseEntity<?> save(TruckPedido truckPedido) {
        Truck truck =  truckRepository.getReferenceById(truckPedido.getTruck().getHawa());
        Pedido pedido = pedidoRepository.getReferenceById(truckPedido.getPedido().getCodigo());

        if(!pedido.getStatus().equals("PENDIENTE")){
            return  ResponseEntity.status(HttpStatus.CONFLICT).body(
                    "No es posible para [pedido]: " + pedido.getCodigo()
                            + " [status]: " + pedido.getStatus() + " anaidir más truck"
            );
        }

        if(!(truck.getStock() == 0) && !(truck.getStock() == null)){
            truck.setStock(truck.getStock() - 1);
            truckRepository.save(truck);

            return ResponseEntity.status(HttpStatus.CREATED).body(truckPedidoRepository.save(truckPedido));
        }

        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error logico");
    }
}
