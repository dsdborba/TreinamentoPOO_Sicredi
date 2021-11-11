package exemplosobjetos;

public class Produto {
    private String tipo;
    private String tamanho;
    private String cor;

    public Produto(String tipo){
        this.tipo=tipo;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void setTamanho (String tamanho){
        this.tamanho=tamanho;
    }
    public void setCor (String cor){
        this.cor=cor;
    }
    public String getTipo (){
        return this.tipo;
    }
    public String getTamanho(){
        return this.tamanho;
    }
    public String getCor(){
        return this.cor;
    }
    public void imprimeCaracteristica(){
        System.out.println(this.getCor());
        System.out.println(this.getTipo());
        System.out.println(this.getTamanho());
    }
}
