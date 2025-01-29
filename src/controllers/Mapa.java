package controllers;

import java.util.HashMap;

public class Mapa {
    public Mapa() {
    hasMapa();
    
    }

    public void hasMapa(){
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Manzana", 10);
        mapa.put("Pera", 11);
        mapa.put("Durazno", 5);
        mapa.put("Mango", 6);

        System.out.println(mapa);
    }
}
