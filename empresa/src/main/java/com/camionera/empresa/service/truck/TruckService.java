package com.camionera.empresa.service.truck;



import com.camionera.empresa.entity.Truck;

import java.util.List;

public interface TruckService {

    List<Truck> list();

    Truck save(Truck truck);
}
