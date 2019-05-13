import banco.Banco;
import java.util.Scanner;

public class baquinho {
    public static void main(String[] args){
        Banco banco = new Banco();
        Scanner saida = new Scanner (System.in);
        
        System.out.print("Digite seu nome: ");
        String nomeDoCliente = saida.next();
        System.out.print("Digite o número da sua conta: ");
        int numero = saida.nextByte();
        System.out.println("Saldo: ");
        Double saldo = saida.nextDouble();
        
    }
}
