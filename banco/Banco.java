
package banco;

public class Banco {

    String nomeDoCliente;
    int numero;
    Double saldo;
    
    
void sacar(){
    if (this.saldo < 0){
        System.out.println("!Esta ação deixará seu saldo negativo!");
    }
}

void depositar(){
}   

}
