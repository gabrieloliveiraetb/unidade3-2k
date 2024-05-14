package exemplos;

public class TesteContaEspecial {
    public static void main(String[] args) {
        ContaEspecial ce = new ContaEspecial(); 
        ce.depositar(100);
        ce.setNumero(123);
        ce.setNomeTitular("Gabriel");
        ce.setLimite(500);
        System.out.println(ce.getSaldo());
        System.out.println("ce");
          }
    
}
