package dio.java.pan.desafios.tres;

import java.util.Scanner;


public class SomaDeFracoes {


    public static void main(String[] Args) {


        double h = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para calcular a soma dos termos");
        double n = sc.nextDouble();


        for (int i = 1; i <= n; i++) {

            h = h + 1d/i;
        }
        System.out.println(Math.round(h));
    }
}