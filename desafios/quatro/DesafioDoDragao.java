package dio.java.pan.desafios.quatro;
import java.util.Scanner;
public class DesafioDoDragao {

        public static void main(String[] args){
            int casos, poderDeLuta;

            Scanner ler = new Scanner(System.in);

            System.out.println("Número de seres vivos analisados:");
            casos = ler.nextInt();

            for(int i = 0; i < casos; i++){
                System.out.println("Digite o poder de luta do ser vivo:");
                poderDeLuta = ler.nextInt();

                if(poderDeLuta <=8000){
                    System.out.println("Inseto!");
                } else {
                    System.out.println("Mais de 8000!");
                }
            }

        }
    }

