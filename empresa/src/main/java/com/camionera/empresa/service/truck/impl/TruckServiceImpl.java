package com.camionera.empresa.service.truck.impl;


import com.camionera.empresa.controller.TruckController;
import com.camionera.empresa.entity.Truck;
import com.camionera.empresa.repository.TruckRepository;
import com.camionera.empresa.service.truck.TruckService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruckServiceImpl implements TruckService {
    @Autowired
    private TruckRepository truckRepository;

    private Logger logger = LoggerFactory.getLogger(TruckServiceImpl.class);
    @Override
    public List<Truck> list() {
        return truckRepository.findAll();
    }

    @Override
    public Truck save(Truck truck) {
        Truck truckTemp = new Truck();
        truckTemp.setDescuento(truck.getDescuento());
        truckTemp.setAnio(truck.getAnio());
        truckTemp.setStock(truck.getStock());
        truckTemp.setModelo(truck.getModelo());
        truckTemp.setMarca(truck.getMarca());
        truckTemp.setPrecio(truck.getPrecio());
        truckTemp.setHawa(truck.getHawa());
        //logger.info(truckTemp);
        System.out.println(truckTemp);
        return truckRepository.save(truckTemp);
    }
}
