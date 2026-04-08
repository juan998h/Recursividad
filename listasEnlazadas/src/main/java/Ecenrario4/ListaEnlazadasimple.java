package Ecenrario4;

public class ListaEnlazadasimple {
    NodoDoble cabeza;

    // AGREGAR
    public void agregar(String jugador) {
        NodoDoble nuevo = new NodoDoble(jugador);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            NodoDoble ultimo = cabeza.anterior;

            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;

            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }
    }

    // ELIMINAR
    public void eliminar(String jugador) {
        if (cabeza == null) return;

        NodoDoble actual = cabeza;

        do {
            if (actual.jugador.equals(jugador)) {

                if (actual.siguiente == cabeza) {
                    cabeza = null;
                    return;
                }

                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;

                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                }
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    // BUSCAR
    public boolean buscar(String jugador) {
        if (cabeza == null) return false;

        NodoDoble aux = cabeza;

        do {
            if (aux.jugador.equals(jugador)) {
                return true;
            }
            aux = aux.siguiente;
        } while (aux != cabeza);

        return false;
    }

    // MOSTRAR
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("Lista vacía");
            return;
        }

        NodoDoble aux = cabeza;

        do {
            System.out.println(aux.jugador);
            aux = aux.siguiente;
        } while (aux != cabeza);
    }

    // MÉTODOS EXTRA (útiles en el escenario)
    public void siguiente() {
        if (cabeza != null) {
            cabeza = cabeza.siguiente;
        }
    }

    public void anterior() {
        if (cabeza != null) {
            cabeza = cabeza.anterior;
        }
    }
}