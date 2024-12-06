/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teesa.cotizaciones.crud;

import java.util.List;



/**
 *
 * @author jhonn
 */
public class ObjetoCotizacion {

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getTotalParcial() {
        return totalParcial;
    }

    public void setTotalParcial(float totalParcial) {
        this.totalParcial = totalParcial;
    }

    public float getOfertaTotal() {
        return ofertaTotal;
    }

    public void setOfertaTotal(float ofertaTotal) {
        this.ofertaTotal = ofertaTotal;
    }

    public List<ProductosCotizacion> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductosCotizacion> productos) {
        this.productos = productos;
    }
    private String nombreCliente;
    private String fecha;
    private String encargado;
    private String nota;
    private float descuento;
    private float totalParcial;
    private float ofertaTotal;
    private List<ProductosCotizacion> productos;
    // Constructor
    public ObjetoCotizacion(String nombreCliente,String fecha,String encargado,String nota,float descuento,float totalParcial,float ofertaTotal,List<ProductosCotizacion> productos  ) {
       this.nombreCliente=nombreCliente;
       this.fecha=fecha;
       this.encargado=encargado;
       this.nota=nota;
       this.descuento=descuento;
       this.totalParcial=totalParcial;
       this.ofertaTotal=ofertaTotal;
       this.productos=productos;
       
    }
}

