package banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class banquinho {

    
    public static void main(String[] args) {
        List<Banco> contas = new ArrayList<Banco>(3);
        Banco banco = new Banco();
        Scanner scan = new Scanner(System.in);
        
        int option;
        do {
            System.out.println("=========== Selecione uma opção ===========");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Efetuar depósito");
            System.out.println("3 - Efetuar saque");
            System.out.println("4 - Array");
            System.out.println("5 - Encerrar");
            System.out.print("opção: ");
            option = scan.nextInt();

            if (option == 1) {
                
                contas.add(banco);
                System.out.print("Digite seu nome: ");
                contas.get(0).nomeDoCliente = scan.next();
                System.out.print("Digite o número da sua conta: ");
                contas.get(0).numConta = scan.nextInt();
                
                System.out.println(contas[0]);
                
            
            } else if (option == 2){   
               banco.depositar(3);
                
            } else if (option == 3) {
                banco.sacar(2);
                
            } else if (option == 4) {
                banco.quantConts();

            } else if (option == 5) {
                System.exit(0);
            }
            
        } while (option != 0);

    }

}
