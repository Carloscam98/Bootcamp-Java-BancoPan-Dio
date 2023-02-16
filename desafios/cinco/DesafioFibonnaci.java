package dio.java.pan.desafios.cinco;

import java.io.IOException;
import java.util.Scanner;
public class DesafioFibonnaci {
    /*Digite um numero para compormos uma sequencia fibonacci que
    mostra o numero atual e a soma dos anteriores:"
    */

        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite um numero para compormos uma sequencia fibonacci:");
            int N = leitor.nextInt();
            int proximo, anterior = 0, atual = 1;
            for (int i = 1; i <= N; i++) {
                if (i == N) System.out.println(anterior);

                else System.out.print(anterior + " " );
                proximo = anterior + atual;
                anterior = atual ;
                atual = proximo ;


            }
        }

    }

