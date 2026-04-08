package org.example.Escenario2;

public class NodoPagina {
    String url;
    NodoPagina siguiente;
    NodoPagina anterior;

    public NodoPagina(String url) {
        this.url = url;
        this.siguiente = null;
        this.anterior = null;
    }
}
