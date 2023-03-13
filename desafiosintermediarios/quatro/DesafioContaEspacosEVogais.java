package dio.java.pan.desafiosintermediarios.quatro;

import java.util.Scanner;

public class DesafioContaEspacosEVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua frase:");
        String str = sc.nextLine();
        str = str.toLowerCase();
        String[] strSplit = str.split(" ");
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length -1, quantVogais = 0;

        System.out.println(" o tamanho da frase é de " + strSplit.length + " palavras");
        for (String item : strSplit) {
            for (int i = 0; i <item.length(); i++){
                char c = item.charAt(i);
                    for (char vogal : arrVogais ) {
                        if (vogal == c){
                            quantVogais++;
                        }
                    }
            }
        }




        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);





        //TODO: Implemente condições (laços) adequados para que possamos contar os espaços em brancos e as vogais que existem na string.
        //Dica: Você pode utilizar o Character.toLowerCase em sua condição:

    }
}


