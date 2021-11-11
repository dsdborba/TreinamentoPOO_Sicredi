package strings;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String objeto = "mouse";
        System.out.println("objeto " + objeto);
        System.out.println("Tamanho da palavra "+ 6);
        System.out.println("Tamanho da palavra "+ objeto.length());
        System.out.println(1+2);
        System.out.println("soma= "+ 1+2);
        System.out.println("soma= "+ (1+2));
        System.out.println(objeto.toUpperCase());
        System.out.println(objeto.replace("ou","us"));
        System.out.println(objeto);
        objeto=objeto.replace("ou", "us");
        System.out.println(objeto);

        String frase= "Estou aprendendo JAVA";
        System.out.println(frase);
        System.out.println(frase.substring(6));
        System.out.println(frase.substring(6, 10));
    }
}
