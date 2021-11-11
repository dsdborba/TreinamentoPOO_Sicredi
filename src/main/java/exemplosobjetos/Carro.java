package exemplosobjetos;

public class Carro {
    private String marca;
    private int portas;
    private boolean hibrido;
    private String cor;
    //Construtor
    //public Carro (String marca){
      //  this.marca=marca;
    //}
    //Construtor
    public Carro (String marca, int portas, boolean hibrido){
        this.marca=marca;
        this.portas=portas;
        this.hibrido=hibrido;
    }
    public void setMarca (String marca){
        this.marca=marca;
    }
    public void setPortas (int portas){
        this.portas=portas;
    }
    public void setHibrido (boolean hibrido){
        this.hibrido=hibrido;
    }
    public String getMarca(){
        return this.marca;
    }
    public int getPortas(){
        return this.portas;
    }
    public boolean getHibrido(){
        return this.hibrido;
    }
    public void imprimeCarro(){
        System.out.println(getMarca());
        System.out.println(getPortas());
        System.out.println(getHibrido());
    }

}
