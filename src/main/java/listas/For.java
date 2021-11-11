package listas;

import java.util.ArrayList;
import java.util.List;

public class For {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Ana");
//        for(String nome: nomes){
//            System.out.println(nome);
//            System.out.println(nome.length());
//
//        }
//        for(int i=0; i< nomes.size(); i=i+1){
//            System.out.println(i);
//            System.out.println(nomes.get(i));
//        }
//        for(int i=0; i<10;i++){
//            System.out.println(i);
//        }
        for(int i=10; i>=0;i--){
            System.out.println(i);

        }


    }

}
