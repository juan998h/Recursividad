package org.example;

public class Venta {

    private String codigo;
    private String nombre;
    private int cantidad;
    private double valorTotal;

    public Venta(String codigo, String nombre, int cantidad, double valorTotal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valorTotal = valorTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo +
                " | Nombre: " + nombre +
                " | Cantidad: " + cantidad +
                " | Total: $" + valorTotal;
    }
}