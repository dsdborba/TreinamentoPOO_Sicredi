package listas;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("um", "primeiro");
        mapa.put("dois", "segundo");
        mapa.put("tres", "terceiro");
        mapa.put("quatro", "quarto");

        System.out.println(mapa.size());
        System.out.println(mapa.get("tres"));
        mapa.put("tres", "terceiro modificado");
        System.out.println(mapa.size());
        System.out.println(mapa.get("tres"));

        mapa.remove("tres", "segundo");
        System.out.println(mapa.size());

        for(String chave: mapa.keySet()){
            System.out.println(mapa.get(chave));
        }

    }
}
