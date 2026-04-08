package org.example.Escenario1;

public class NodoCliente {
    String nombre;
    NodoCliente siguiente;

    public NodoCliente(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoCliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCliente siguiente) {
        this.siguiente = siguiente;
    }
}
