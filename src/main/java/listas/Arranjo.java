package listas;

import exemplosobjetos.Carro;

public class Arranjo {
    public static void main(String[] args) {
        String[] lista1 = {"carro", "moto", "avião", "barco"};
        System.out.println(lista1);
        System.out.println(lista1[0]);
        lista1[1]="bicicleta";
        System.out.println(lista1[1]);
        System.out.println(lista1.length);

        Carro carro1 = new Carro("Audi");
        carro1.setPortas(4);
        carro1.setHibrido(true);

        Carro carro2 = new Carro("BMW", 2, false);
        Carro [] listaCarro = {carro1, carro2};

        System.out.println(listaCarro[1].getPortas());
        System.out.println(listaCarro[0].getMarca());

        Carro[] listaCarro2 = {
                new Carro("Fiat",2, true),
                new Carro("VW", 4, false),
        };
        System.out.println(listaCarro2[0].getMarca());

    }
}
