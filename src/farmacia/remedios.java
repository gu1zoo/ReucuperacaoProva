
package farmacia;
import java.util.Scanner;

public class remedios {
    Scanner ler = new Scanner(System.in);
    String nome;
    double valor;

    public remedios (String nome, double valor){
        int n = 1;
        System.out.println("Digite o nome do remedio generico "+n":");
        n =+ n + 1;  
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
