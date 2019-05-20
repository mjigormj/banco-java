package banco;

import java.util.Scanner;

public class banquinho {
    public static void main(String[] args){
        Banco banco = new Banco();
        Scanner scan= new Scanner (System.in);
        int option;
        do {
            System.out.println("=========== Selecione uma opção ===========");
            System.out.println("1 - Efetuar depósito");
            System.out.println("3 - Encerrar");
            System.out.println("opção: ");
            option = scan.nextInt();
        }
        
        
        
        
        System.out.print("Digite seu nome: ");
        String nomeDoCliente = scan.next();
        
        System.out.print("Digite o número da sua conta: ");
        int numero = scan.nextInt();
             
        System.out.println("Digite o valor para realizar o saque: ");
        Double valorASerSacado = scan.nextDouble();
        banco.sacar(valorASerSacado);
        
        System.out.println("Digite o valor para realizar um deposito: ");
        Double valorASerDepositado = scan.nextDouble();
        banco.depositar(valorASerDepositado);
    }
}
