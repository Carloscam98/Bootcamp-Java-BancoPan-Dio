package dio.java.pan.agenciabancaria.programa;


import java.util.ArrayList;
import java.util.Scanner;

public class diojavapanagenciabancaria {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }

    public static void operacoes(){

        System.out.println("------------------------------------------------------");
        System.out.println("-------------Bem vindos a nossa Agência---------------");
        System.out.println("------------------------------------------------------");
        System.out.println("***** Selecione uma operação que deseja realizar *****");
        System.out.println("------------------------------------------------------");
        System.out.println("|   Opção 1 - Criar conta   |");
        System.out.println("|   Opção 2 - Depositar     |");
        System.out.println("|   Opção 3 - Sacar         |");
        System.out.println("|   Opção 4 - Transferir    |");
        System.out.println("|   Opção 5 - Listar        |");
        System.out.println("|   Opção 6 - Sair          |");

        int operacao = input.nextInt();
        input.nextLine();
        switch (operacao){

            case 1:
                criarConta();
            case 2:
                depositar();
            case 3:
                sacar();
            case 4:
                transferir();
            case 5:
                listarContas();
            case 6:
                System.out.println("Obrigado por usar nossa agência");
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
                operacoes();
                break;

        }
    }
    public static void criarConta(){
        System.out.println("Nome: ");
        String nome = input.nextLine();

        System.out.println("CPF: ");
        String cpf = input.nextLine();

        System.out.println("Email: ");
        String email = input.nextLine();

        Pessoa pessoa = new Pessoa(nome, cpf, email);
        Conta conta = new Conta(pessoa);

        contasBancarias.add(conta);
        System.out.println("Sua conta foi criada com sucesso!");

        operacoes();
    }

    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;
        if (contasBancarias.size() > 0) {
            for (Conta c : contasBancarias) {
                if (c.getNumeroConta() == numeroConta) {
                    conta = c;
                }
            }
        }
        return conta;
    }
    public static void depositar(){
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if (conta != null){
            System.out.println("Qual valor deseja depositar: ");
            Double valorDeposito = input.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println("Valor depositado com sucesso!");
        }else {
            System.out.println("Conta não encontrada!");
        }
        operacoes();
    }

    public static void sacar(){
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if (conta != null){
            System.out.println("Qual valor deseja sacar: ");
            Double valorSaque = input.nextDouble();
            conta.sacar(valorSaque);
            //System.out.println("Valor sacado com sucesso!");
        }else {
            System.out.println("Conta não encontrada!");
        }
        operacoes();
    }

    public static void transferir(){
        System.out.println("Número da conta do remetente: ");
        int numeroContaRemetente = input.nextInt();

        Conta contaRemetente = encontrarConta(numeroContaRemetente);

        if (contaRemetente != null){
            System.out.println("Numero da conta do Destinatario: ");
            int numeroContaDestinatario = input.nextInt();

            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);
            if (contaDestinatario != null){
                System.out.println("Valor da transferência: ");
                Double valor = input.nextDouble();

                contaRemetente.transferir(contaDestinatario, valor);
            }else {
                System.out.println("A conta para depósito não foi encontrada! ");
            }
        }else {
            System.out.println("A conta para transferência não foi encontrada! ");
        }
        operacoes();
    }
    public static void listarContas(){
        if (contasBancarias.size() > 0){
            for (Conta conta: contasBancarias){
                System.out.println(conta);
            }
        }else{
            System.out.println("Não há contas cadastradas!");
        }
        operacoes();
    }


}
