package com.camionera.empresa.controller;

import com.camionera.empresa.entity.Truck;
import com.camionera.empresa.service.truck.TruckService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/truck")
public class TruckController {
    @Autowired
    private TruckService truckService;

    private Logger logger = LoggerFactory.getLogger(TruckController.class);
    @GetMapping("list")
    public ResponseEntity<List<Truck>> truckList(){
        return ResponseEntity.ok().body(truckService.list());
    }

    @PostMapping
    public ResponseEntity<?> truckSave(@RequestBody Truck truck){
        System.out.println(truck);
        if (truck != null){
            Truck truckTemp = truckService.save(truck);
            return ResponseEntity.ok(truckTemp);
        }

        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("empty-truck:" + truck);
    }

}
