package com.camionera.empresa.entity;

import javax.persistence.*;

@Entity
@Table(name = "TRUCK_PEDIDO")
public class TruckPedido {

    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CODIGO")
    Pedido pedido;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_HAWA")
    Truck truck;

    public TruckPedido() {
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TruckPedido{" +
                "id=" + id +
                ", pedido=" + pedido +
                ", truck=" + truck +
                '}';
    }
}
