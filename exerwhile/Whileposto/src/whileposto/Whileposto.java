package whileposto;

import java.util.Scanner;

public class Whileposto {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int comb;
int a = 0;
int g = 0;
int d = 0;

System.out.println("Seja bem vindo, escolha o seu tipo de combustível");
        
    System.out.println("1- Álcool. 2- Gasolina. 3- Diesel.  4- FIM");
        
    System.out.println("Qual tipo de Combustível:   ");
    comb = sc.nextInt();
    
    while(comb!=4){
        if(comb==1){
            a++;
        }
        else if(comb==2){
            g++;
        }
        else if(comb==3){
            d++;
        }
        else{
            System.out.println("Muito Obrigado!");
        }
        comb = sc.nextInt();
    
        
    }
        System.out.println("Alcool: "+a);
        System.out.println("Gasolina: "+g);
        System.out.println("Diesel: "+d);
        
        sc.close();

    }
    
}
