package exemplosobjetos;

public class AplicacaoTelevisao {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.setMarca("Samsung");
        tv.setPolegadas(42);
        tv.setResolucao("4K");

        tv.imprimeTV();


    }
}
