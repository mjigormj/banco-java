package banco;

import java.util.ArrayList;
import java.util.Scanner;



public class Banco {

    static Scanner sacn = new Scanner (System.in);

    
    int numConta; // null        
    String nomeDoCliente; // null
    int numero; // null
    Double saldo = 100.00;

    Scanner scan = new Scanner(System.in);
    
    ArrayList<Banco> contas = new ArrayList<Banco>();  
    
    public void criarConta() {
        contas.set(0, new Banco()); 
        System.out.print("Digite seu nome: ");
        contas.get(0).nomeDoCliente = scan.next();
        System.out.print("Digite o número da sua conta: ");
        contas.get(0).numConta = scan.nextInt();
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
            System.out.println("Seu novo saldo é:" + saldo);
        }
    }

    public void quantConts() {
        
        System.out.println("A quantia de contas neste banco é: "+contas.size());



    }


}
