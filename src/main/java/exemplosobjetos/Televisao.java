package exemplosobjetos;

public class Televisao {
    private String marca;
    private int polegadas;
    private String resolucao;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }
    public void imprimeTV(){
        System.out.println(getMarca());
        System.out.println(getPolegadas());
        System.out.println(getResolucao());

    }
}
