package org.example.Escenario1;

public class ColaPanaderia {
    private NodoCliente frente;
    private NodoCliente fin;

    public ColaPanaderia() {
        this.frente = null;
        this.fin = null;
    }

    // Operación: agregar (encolar)
    public void agregarCliente(String nombre) {
        NodoCliente nuevoCliente = new NodoCliente(nombre);
        if (frente == null) {
            frente = nuevoCliente;
            fin = nuevoCliente;
        } else {
            fin.siguiente = nuevoCliente;
            fin = nuevoCliente;
        }
        System.out.println("Cliente " + nombre + " agregado a la fila.");
    }

    // Operación: eliminar (atender/desencolar)
    public void atenderCliente() {
        if (frente == null) {
            System.out.println("No hay clientes en espera.");
            return;
        }
        System.out.println("Atendiendo a: " + frente.nombre);
        frente = frente.siguiente;
        if (frente == null) { // Si la cola quedó vacía
            fin = null;
        }
    }

    // Operación: buscar (consultar el siguiente sin eliminar)
    public void verSiguiente() {
        if (frente == null) {
            System.out.println("No hay clientes en espera.");
        } else {
            System.out.println("El siguiente en ser atendido es: " + frente.nombre);
        }
    }

    // Operación: mostrar
    public void mostrarTurnos() {
        if (frente == null) {
            System.out.println("La fila está vacía.");
            return;
        }
        System.out.print("Fila actual: ");
        NodoCliente actual = frente;
        while (actual != null) {
            System.out.print("[" + actual.nombre + "] -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

}
