package listas;

import exemplosobjetos.Carro;

public class ArranjoTimes {
    public static void main(String[] args) {
        String [] times = {"Inter", "Roma", "River", "Arsenal"};
        System.out.println(times);
        System.out.println(times.length);
        System.out.println(times[0]);

        Carro carro3 = new Carro("Honda", 4, true);
        System.out.println(carro3.getMarca());
        System.out.println(carro3.getPortas());
        System.out.println(carro3.getHibrido());

    }
}
