package Ecenrario4;

public class NodoDoble {
    String jugador;
    NodoDoble siguiente;
    NodoDoble anterior;

    public NodoDoble(String jugador) {
        this.jugador = jugador;
        this.siguiente = null;
        this.anterior = null;
    }
}