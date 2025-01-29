package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
    System.out.println("Metodo hasMap");
    hasMapa();
    System.out.println("Metodo linkedhashMap");
    linkedhashMapa();
    System.out.println("Meotodo treeMap");
    treeMapa();
    
    }

    public void hasMapa(){
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);

        // contaisKer
        System.out.println("Hay Pera" + mapa.containsKey("Pera"));
        System.out.println("Hay Kiwi" + mapa.containsKey("Kiwi"));

        // Obtener el valor
        System.out.println("Valor de Pera"+mapa.get("Pera"));

        // Eliminar item
        mapa.remove("Pera");
        System.out.println(mapa);
    }
    public void linkedhashMapa(){
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);

        // contaisKer
        System.out.println("Hay Pera" + mapa.containsKey("Pera"));
        System.out.println("Hay Kiwi" + mapa.containsKey("Kiwi"));

        // Obtener el valor
        System.out.println("Valor de Pera"+mapa.get("Pera"));

        // Eliminar item
        mapa.remove("Pera");
        System.out.println(mapa);
    }
    public void treeMapa(){
        TreeMap<String, Integer> mapa = new TreeMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);

        // contaisKer
        System.out.println("Hay Pera" + mapa.containsKey("Pera"));
        System.out.println("Hay Kiwi" + mapa.containsKey("Kiwi"));

        // Obtener el valor
        System.out.println("Valor de Pera"+mapa.get("Pera"));

        // Eliminar item
        mapa.remove("Pera");
        System.out.println(mapa);
    }
}
