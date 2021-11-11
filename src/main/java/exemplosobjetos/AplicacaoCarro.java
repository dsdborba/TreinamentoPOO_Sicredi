package exemplosobjetos;

public class AplicacaoCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("VW");
        carro1.setPortas(4);
        carro1.setHibrido(true);

        carro1.imprimeCarro();

        Carro carro2 = new Carro("BMW", 2, false);
        carro2.imprimeCarro();

    }

}
