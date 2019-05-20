package banco;

public class Banco {

    String nomeDoCliente;
    int numero;
    Double saldo = 100.00;

    public void sacar(double valorASerSacado) {
        if (saldo < valorASerSacado) {
            System.out.println("!Esta ação deixará seu saldo negativo!");
        } else {
            saldo = saldo - valorASerSacado;
            System.out.println("Operação realizada com sucesso");
        }
    }

    public void depositar(double valorASerDepositado) {
        if (valorASerDepositado < 0) {
            System.out.println("Impossivel depositar um valor negativo");
        } else {
            saldo = saldo + valorASerDepositado;
            System.out.println("Operação realizada com sucesso");
        }
    }

}
