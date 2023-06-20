package com.camionera.empresa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity()
@Table(name = "TRUCK")
public class Truck {
    @Id
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
    //@SequenceGenerator(name="SEQUENCE1", sequenceName="SEQUENCE1", allocationSize=1)
    @Column(name = "HAWA", length = 30)
    private String hawa;

    @Column(name = "MARCA", length = 30)
    private String marca;

    @Column(name = "MODELO", length = 40)
    private String modelo;

    @Column(name = "ANIO")
    private Long anio;

    @Column(name = "PRECIO")
    private Long precio;

    @Column(name = "STOCK")
    private Long stock;

    @Column(name = "DESCUENTO")
    private Long descuento;

    @OneToMany(mappedBy = "truck", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Audito> auditoList =  new ArrayList<>();

    @OneToMany(mappedBy = "truck", cascade = CascadeType.ALL)
    @JsonIgnore
    List<TruckPedido> truckPedidoList = new ArrayList<>();

    public Truck() {
    }

    public String getHawa() {
        return hawa;
    }

    public void setHawa(String hawa) {
        this.hawa = hawa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getAnio() {
        return anio;
    }

    public void setAnio(Long anio) {
        this.anio = anio;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getDescuento() {
        return descuento;
    }

    public void setDescuento(Long descuento) {
        this.descuento = descuento;
    }

    public List<Audito> getAuditoList() {
        return auditoList;
    }

    public void setAuditoList(List<Audito> auditoList) {
        this.auditoList = auditoList;
    }

    public List<TruckPedido> getTruckPedidoList() {
        return truckPedidoList;
    }

    public void setTruckPedidoList(List<TruckPedido> truckPedidoList) {
        this.truckPedidoList = truckPedidoList;
    }


    @Override
    public String toString() {
        return "Truck{" +
                "hawa='" + hawa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", precio=" + precio +
                ", stock=" + stock +
                ", descuento=" + descuento +
                ", auditoList=" + auditoList +
                ", truckPedidoList=" + truckPedidoList +
                '}';
    }
}
