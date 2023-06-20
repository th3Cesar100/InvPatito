package com.camionera.empresa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PEDIDO")
public class Pedido {

    @Id
    @Column(name = "CODIGO", length = 30)
    private String codigo;

    @Column(name = "ESTATUS", length = 30)
    private String status;

    @Column(name = "NOMBRE_CLIENTE", length = 30)
    private String nombreCliente;

    @CreationTimestamp
    @JsonIgnore
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    @JsonIgnore
    List<TruckPedido> truckPedidoList = new ArrayList<>();

    public Pedido() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<TruckPedido> getTruckPedidoList() {
        return truckPedidoList;
    }

    public void setTruckPedidoList(List<TruckPedido> truckPedidoList) {
        this.truckPedidoList = truckPedidoList;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codigo='" + codigo + '\'' +
                ", status='" + status + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", truckPedidoList=" + truckPedidoList +
                '}';
    }
}
