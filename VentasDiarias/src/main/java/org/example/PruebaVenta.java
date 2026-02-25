package org.example;

import java.util.*;

public class PruebaVenta {

    public static void main(String[] args) {

        probarEstructura(new HashMap<>(), "HashMap");
        probarEstructura(new LinkedHashMap<>(), "LinkedHashMap");
        probarEstructura(new TreeMap<>(), "TreeMap");
    }

    public static void probarEstructura(Map<String, Venta> mapa, String nombreEstructura) {

        int cantidadDatos = 100000;

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();

        long inicio = System.nanoTime();

        // Insertar datos
        for (int i = 0; i < cantidadDatos; i++) {
            String codigo = "P" + i;
            Venta venta = new Venta(codigo, "Producto" + i, i, i * 1000);
            mapa.put(codigo, venta);
        }

        // Buscar un elemento
        mapa.get("P50000");

        long fin = System.nanoTime();

        long memoriaDespues = runtime.totalMemory() - runtime.freeMemory();

        long tiempoTotal = fin - inicio;
        long memoriaUsada = memoriaDespues - memoriaAntes;

        System.out.println("----- " + nombreEstructura + " -----");
        System.out.println("Tiempo (ms): " + tiempoTotal / 1_000_000.0);
        System.out.println("Memoria usada (KB): " + memoriaUsada / 1024);
        System.out.println();
    }
}