package dio.java.pan.desafiosintermediarios.cinco;

import java.io.IOException;
import java.util.Scanner;

public class DesafioTaxaDeImpostoDeRenda {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o salário: ");
        double renda = leitor.nextDouble();
        double imposto;
        if(renda <= 2000.00){
            System.out.println("Isento de impostos!");
        }else if(renda > 2000.00 && renda <= 3000.00){
            imposto = (renda - 2000.00) * 0.08;
            System.out.println(String.format("O imposto a ser pago pelo trabalhador é de R$ %.2f " , imposto));
        }else if(renda > 3000.00 && renda <= 4500.00){
            imposto = ((renda - 3000.00) * 0.18) + 1000 * 0.08;
            System.out.println(String.format("O imposto a ser pago pelo trabalhador é de R$ %.2f " , imposto));
        }else {
            imposto = ((renda - 4500.00) * 0.28) + (1500 * 0.18) + 1000 * 0.08;
            System.out.println(String.format("O imposto a ser pago pelo trabalhador é de R$ %.2f " , imposto));
        }
        //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:
    }
}


