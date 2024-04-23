package unidade3;
import java.util.Scanner;
public class Carro {
    String modelo;
    String marca;
    int ano;
    
    void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("--------------------");
    }
    
    void solicitarInfo() {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a marca do veículo: ");
        marca = leia.nextLine();
        System.out.print("Digite o modelo: ");
        modelo = leia.nextLine();
        System.out.print("Digite o ano: ");
        ano = leia.nextInt();        
    }
    
}
 