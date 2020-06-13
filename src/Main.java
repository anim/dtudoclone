
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Carro vetor[] = new Carro[10];
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i <= 1; i++){
            Carro carro = new Carro();
            
            System.out.println("Digite o ano do carro: ");
            carro.setAno(scan.nextInt());
            System.out.println("Digite a marca do carro: ");
            carro.setMarca(scan.next());
            System.out.println("Digite o número de portas do carro: ");
            carro.setNumeroPortas(scan.nextInt());
            System.out.println("Digite o tamanho do porta malas do carro: ");
            carro.setTamanhoPortaMalas(scan.nextInt());
            
            vetor[i] = carro;
        }
        
        System.out.println("DADOS DOS CARROS");
        for (int i = 0; i <= 1; i++){
            System.out.println("Ano do Carro: " + vetor[i].getAno());
            System.out.println("Marca do Carro: " + vetor[i].getMarca());
            System.out.println("Número de Portas do Carro: " + vetor[i].getNumeroPortas());
            System.out.println("Tamanho do Porta Malas do Carro: " + vetor[i].getTamanhoPortaMalas());
            System.out.println("\n");
        }
        
    }
}
