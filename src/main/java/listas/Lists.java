package listas;

import exemplosobjetos.Carro;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> legumes = new ArrayList<>();
        legumes.add("cebola");
        legumes.add("couve");
        legumes.add("cenoura");
        legumes.add("beterraba");
        System.out.println(legumes);
        legumes.remove(1);
        System.out.println(legumes);
        legumes.remove("cenoura");
        System.out.println(legumes);
        System.out.println(legumes.get(0));
        System.out.println(legumes.contains("cenoura"));

        Carro carro1 = new Carro("VW");
        carro1.setPortas(4);
        carro1.setHibrido(true);

        Carro carro2 = new Carro("BMW", 2, false);
        Carro [] listaCarro = {carro1, carro2};

        List<Carro> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);
        System.out.println(carros.get(1).getMarca());
        carros.add(new Carro("Volvo", 4, true));
        carros.add(new Carro("Ferrari", 2, false));
        System.out.println(carros.get(3).getMarca());
    }
}
