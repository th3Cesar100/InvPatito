package com.camionera.empresa.repository;

import com.camionera.empresa.entity.Truck;
import com.camionera.empresa.entity.TruckPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TruckPedidoRepository extends JpaRepository<TruckPedido, Long> {

    //List<Truck> findByTruck(Truck truck);
}
