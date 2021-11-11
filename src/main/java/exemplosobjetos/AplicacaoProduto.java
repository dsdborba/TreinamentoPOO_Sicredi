package exemplosobjetos;

public class AplicacaoProduto {
    public static void main(String[] args) {
        Produto roupa = new Produto("camiseta");
        roupa.setCor("preto");
        roupa.setTamanho("G");

        roupa.imprimeCaracteristica();
        roupa.setTipo("meia");
        roupa.imprimeCaracteristica();
    }
}
