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
            System.out.print("opção: ");
            option = scan.nextInt();

            if (option == 1) {
               banco.criarConta();
            
            } else if (option == 2){   
               banco.depositar(3);
                
            } else if (option == 3) {
                banco.sacar(2);
                
            } else if (option == 4) {
                banco.extrato();

            } else if (option == 5) {
                System.exit(0);
            }

        } while (option != 0);

    }

}
