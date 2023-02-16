package dio.java.pan.desafios.um;
import java.util.Scanner;
public class CalcularPreçoDoCarro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do carro:");
        int custoFabrica = scan.nextInt();
        System.out.println("Digite a porcentagem do distribuidor:");
        int porcentagemDistribuidor = scan.nextInt();
        System.out.println("Digite o percentual de impostos:");
        int PercentualImpostos = scan.nextInt();

        int custoConsumidor;

        int Distribuidor;
        int ValorImpostos;

        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:

        ValorImpostos = (custoFabrica * PercentualImpostos) / 100;
        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;

        int preçoTotalFinal = custoFabrica + Distribuidor + ValorImpostos;
        System.out.println("O valor total do carro é de " + preçoTotalFinal + "$" );

    }
}

