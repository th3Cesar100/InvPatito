package com.camionera.empresa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "AUDITO")
public class Audito {

    @Id
    @Column(name = "ID")
    private Long id;

    @CreationTimestamp
    @JsonIgnore
    @Column(name = "FECHA_EVENTO")
    private Date fechaEvento;

    @Column(name = "USUARIO", length = 30)
    private String usuario;

    @Column(name = "ID_TIENDA", length = 40)
    private String idTienda;

    @Column(name = "NOMBRE_CLIENTE", length = 30)
    private String nombreCliente;

    @Column(name = "NOMBRE_VEN", length = 30)
    private String nombreVendedor;

    @ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_HAWA")
    Truck truck;

    public Audito() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(String idTienda) {
        this.idTienda = idTienda;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    @Override
    public String toString() {
        return "Audito{" +
                "id=" + id +
                ", fechaEvento=" + fechaEvento +
                ", usuario='" + usuario + '\'' +
                ", idTienda='" + idTienda + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", nombreVendedor='" + nombreVendedor + '\'' +
                ", truck=" + truck +
                '}';
    }
}
