package com.generation.evaluacionrecuperativajava.models;



public class Ventas extends Producto {
    public int cantidadProducto;
    public Double totalVenta;
    
    
    public Ventas() {
        super();
    }


    public Ventas(String nombre, String categoria, Double precio, int stock, int cantidadProducto, Double totalVenta) {
        super(nombre, categoria, precio, stock);
        this.cantidadProducto = cantidadProducto;
        this.totalVenta = totalVenta;
    }


    public int getCantidadProducto() {
        return cantidadProducto;
    }


    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }


    public Double getTotalVenta() {
        return totalVenta;
    }


    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }


    @Override
    public String toString() {
        return super.toString() + "Ventas [cantidadProducto=" + cantidadProducto + ", totalVenta=" + totalVenta + "]";
    }

    

    


    
}
