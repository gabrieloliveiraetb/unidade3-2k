package unidade3;
public class TesteCarro {    
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        c1.marca = "Fiat";
        c1.modelo = "Palio";
        c1.ano = 2010;    
        c2.marca = "VW";
        c2.modelo = "Fusca";
        c2.ano = 1972;
        c1.exibirInfo();
        c2.exibirInfo();
        
        Monitor m = new Monitor();
        m.frequencia = 60;
        m.marca = "LG";
        m.modelo = "LW22K";
        m.preco = 540;
    }

}
