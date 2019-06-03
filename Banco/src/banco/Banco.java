package banco;

import java.util.Scanner;
import java.util.List;
import.java.util.ArrayList;


public class Banco {

    static Scanner sacn = new Scanner (System.in);
    static List<ContaCorrente> contas = new ArrayList<>();
    
    String nomeDoCliente;
    int numero;
    Double saldo = 100.00;
    Scanner scan = new Scanner(System.in);

    public void criarConta() {
        System.out.print("Digite seu nome: ");
        String nomeDoCliente = scan.next();
        System.out.print("Digite o número da sua conta: ");
        int numero = scan.nextInt();
    }

    public void depositar(double valorASerDepositado) {
        if (valorASerDepositado < 0) {
            System.out.println("Impossivel depositar um valor negativo");
        } else {
            saldo = saldo + valorASerDepositado;
            System.out.println("Operação realizada com sucesso");
        }
    }

    public void sacar(double valorASerSacado) {
        if (saldo < valorASerSacado) {
            System.out.println("!Esta ação deixará seu saldo negativo!");
        } else {
            saldo = saldo - valorASerSacado;
            System.out.println("Operação realizada com sucesso");
        }
    }

    public void extrato() {
        System.out.println(nomeDoCliente);
        System.out.println(numero);
        System.out.println(saldo);
    }

    private static class ContaCorrente {

        public ContaCorrente() {
            
        }
    }

}
