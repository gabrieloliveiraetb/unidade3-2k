package exemplos;

public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(100);
        c.depositar(50);
        boolean saqueEfetuado = c.sacar(300);
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.err.println("ERRO AO SACAR!!!");
        }
        System.out.println("Saldo: " + c.saldo);
    }
}
