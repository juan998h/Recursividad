package org.example.Escenario2;

public class HistorialNavegador {
    private NodoPagina actual;

    public HistorialNavegador() {
        this.actual = null;
    }

    // Operación: agregar (visitar nueva página) y eliminar (borrar futuros)
    public void visitarPagina(String url) {
        NodoPagina nuevaPagina = new NodoPagina(url);

        if (actual != null) {
            nuevaPagina.anterior = actual;
            actual.siguiente = nuevaPagina;
            // Al enlazar el siguiente a la nueva página, automáticamente
            // "eliminamos" por recolección de basura cualquier página futura
        }
        actual = nuevaPagina;
        System.out.println("Visitando: " + actual.url);
    }

    // Operación: buscar/moverse (retroceder)
    public void retroceder() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
            System.out.println("Retrocediendo a: " + actual.url);
        } else {
            System.out.println("No hay páginas anteriores.");
        }
    }

    // Operación: buscar/moverse (avanzar)
    public void avanzar() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
            System.out.println("Avanzando a: " + actual.url);
        } else {
            System.out.println("No hay páginas hacia adelante.");
        }
    }

    // Operación: mostrar
    public void mostrarPaginaActual() {
        if (actual != null) {
            System.out.println("Página actual: " + actual.url);
        } else {
            System.out.println("Navegador en blanco.");
        }
    }
}
