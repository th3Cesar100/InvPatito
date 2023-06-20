package com.camionera.empresa.controller;

import com.camionera.empresa.entity.Pedido;
import com.camionera.empresa.service.pedido.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("list")
    public ResponseEntity<List<Pedido>> list(){
        return ResponseEntity.ok().body(pedidoService.list());
    }

    @PostMapping()
    public ResponseEntity<?> save(@RequestBody Pedido pedido){
        pedidoService.save(pedido);
        return ResponseEntity.ok(pedido);
    }

}
