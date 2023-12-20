package programa;

import java.util.Scanner;
import java.util.ArrayList;

public class AgenciaBancaria {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }

    public static void operacoes(){
        System.out.println("---------------------------------------------------");
        System.out.println("--------------------- BEM VINDO -------------------");
        System.out.println("********** Selecione a operação desejada **********");
        System.out.println("---------------------------------------------------");
        System.out.println("   |           Opção 1 - Criar conta        |");
        System.out.println("   |           Opção 2 - Depositar          |");
        System.out.println("   |           Opção 3 - Sacar              |");
        System.out.println("   |           Opção 4 - Transferir         |");
        System.out.println("   |           Opção 6 - Sair               |");
        System.out.println("---------------------------------------------------");

        int operacao = input.nextInt();

        switch (operacao) {
            case 1:
                criarConta();
                break;

            case 2:
                depositar();
                break;

            case 3:
                sacar();
                break;

            case 4:
                transferir();
                break;

            case 5:
                listar();
                break;

            case 6:
                System.out.println("Valeu irmão, volte sempre e vai corinthians!");
                System.exit(0);
                break;
        
            default:
                System.out.println("Digite uma opção válida!");
                break;
        }
    }

    public static void criarConta() {
        System.out.printf("\nNome: ");
        String nome = input.nextLine();

        System.out.printf("\nCPF: ");
        String cpf = input.nextLine();

        System.out.printf("\nEmail: ");
        String email = input.nextLine();

        Pessoa pessoa = new Pessoa(nome, cpf, email);
        Conta conta = new Conta(pessoa);
        contasBancarias.add(conta); 

        System.out.println("Conta criada com sucesso!");

        operacoes();
    }

    private static Conta encontrarConta(int numeroConta){
        Conta conta = null;
        if(contasBancarias.size() > 0){
            for(Conta c: contasBancarias){
                if(c.getNumeroConta() == numeroConta){
                    conta = c;
                }
            }
        }
        return conta;
    }

    public static void depositar(){
        System.out.printf("Número da conta: ");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);
        if(conta != null){
            System.out.println();
        }
    }
}