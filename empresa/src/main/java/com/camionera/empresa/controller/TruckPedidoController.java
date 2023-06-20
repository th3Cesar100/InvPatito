package com.camionera.empresa.controller;

import com.camionera.empresa.entity.TruckPedido;
import com.camionera.empresa.service.truckpedido.TruckPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/truckpedido")
public class TruckPedidoController{

    @Autowired
    private TruckPedidoService truckPedidoService;

    @GetMapping("list")
    public ResponseEntity<List<TruckPedido>> list(){
        return ResponseEntity.status(HttpStatus.OK).body(truckPedidoService.list());
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody TruckPedido truckPedido){
        return truckPedidoService.save(truckPedido);
    }

}
