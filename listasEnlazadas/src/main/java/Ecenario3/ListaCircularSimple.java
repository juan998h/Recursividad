package Ecenario3;

public class ListaCircularSimple {
    Nodo cabeza;

    // AGREGAR
    public void agregar(String cancion) {
        Nodo nuevo = new Nodo(cancion);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            Nodo aux = cabeza;
            while (aux.siguiente != cabeza) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    // ELIMINAR
    public void eliminar(String cancion) {
        if (cabeza == null) return;

        Nodo actual = cabeza;
        Nodo anterior = null;

        do {
            if (actual.cancion.equals(cancion)) {

                if (actual == cabeza && actual.siguiente == cabeza) {
                    cabeza = null;
                    return;
                }

                if (actual == cabeza) {
                    Nodo temp = cabeza;
                    while (temp.siguiente != cabeza) {
                        temp = temp.siguiente;
                    }
                    cabeza = cabeza.siguiente;
                    temp.siguiente = cabeza;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    // BUSCAR
    public boolean buscar(String cancion) {
        if (cabeza == null) return false;

        Nodo aux = cabeza;

        do {
            if (aux.cancion.equals(cancion)) {
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

        Nodo aux = cabeza;

        do {
            System.out.println(aux.cancion);
            aux = aux.siguiente;
        } while (aux != cabeza);
    }
}