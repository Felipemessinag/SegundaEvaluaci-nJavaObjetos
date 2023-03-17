package com.generation.evaluacionrecuperativajava.models;

public class Producto {
    public String nombre;
    public String categoria;
    public Double precio;
    public Integer stock;
    
    
    
    public Producto() {
    }


    public Producto(String nombre, String categoria, Double precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;

    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCategoria() {
        return categoria;
    }


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public Double getPrecio() {
        return precio;
    }


    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }


    public void setStock(Integer stock) {
        this.stock = stock;
    }


    @Override
    public String toString() {
        return " nombre= " + nombre + ", categoria= " + categoria + ", stock= " + stock;
    }


 


    

    

    

}
