package banco;

import java.util.Scanner;

public class banquinho {

    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scan = new Scanner(System.in);
        int option;
        do {
            System.out.println("=========== Selecione uma opção ===========");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Efetuar depósito");
            System.out.println("3 - Efetuar saque");
            System.out.println("4 - Extrato");
            System.out.println("5 - Encerrar");
            System.out.println("opção: ");
            option = scan.nextInt();

            if (option == 1) {
                System.out.print("Digite seu nome: ");
                String nomeDoCliente = scan.next();
                System.out.print("Digite o número da sua conta: ");
                int numero = scan.nextInt();
            } else if (option == 3) {
                banco.sacar(2);

            } else if (option == 4) {
                System.out.println(nomeDoCliente);
                System.out.println(numero);
                System.out.println(saldo);
            } else if (option == 5) {
                System.exit(0);
            }

        } while (option != 0);

    }

}
