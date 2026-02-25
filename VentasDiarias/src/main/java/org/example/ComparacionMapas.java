package org.example;

import java.util.*;

public class ComparacionMapas {

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> treeMap = new TreeMap<>();

        // Insertamos en desorden
        String[] codigos = {"P3", "P1", "P4", "P2"};

        for (String codigo : codigos) {
            hashMap.put(codigo, "Producto " + codigo);
            linkedHashMap.put(codigo, "Producto " + codigo);
            treeMap.put(codigo, "Producto " + codigo);
        }

        System.out.println("===== HASHMAP =====");
        recorrerMapa(hashMap);

        System.out.println("\n===== LINKEDHASHMAP =====");
        recorrerMapa(linkedHashMap);

        System.out.println("\n===== TREEMAP =====");
        recorrerMapa(treeMap);
    }

    public static void recorrerMapa(Map<String, String> mapa) {
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}