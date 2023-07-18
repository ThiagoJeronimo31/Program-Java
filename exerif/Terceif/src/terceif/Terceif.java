package terceif;

import java.util.Scanner;

public class Terceif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double preco;
        double desconto;
        
        System.out.println("Digite o preço do produto");
        preco = sc.nextDouble();
        
        desconto = (preco < 20.0)? preco*0.1: preco*0.05;
        
        System.out.println("Você teve um desconto de "+desconto);
        
        
        
        
        
    }
    
}
