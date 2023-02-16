package dio.java.pan.desafios.dois;

import java.io.IOException;
import java.util.Scanner;

public class ImprimindoPositivosEMedia {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        int x ;
        double somaPositivos = 0;
        double num;

        for ( x = 1; x <= 6 ; x ++ ) {
            System.out.println("Digite um valor: ");
            num = leitor.nextDouble();
            if(num > 0){
                cont++;
                somaPositivos = somaPositivos + num;
            }
        }
        media = somaPositivos / cont;

        System.out.println("Dos valores digitados, " + cont + " são positivos");
        System.out.println(String.format("A média dos números digitados é %.1f", media));


    }

}





