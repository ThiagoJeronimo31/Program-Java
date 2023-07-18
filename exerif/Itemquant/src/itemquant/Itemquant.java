package itemquant;

import java.util.Scanner;

public class Itemquant {

    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 
 double cod;
 double quant;
 
    System.out.println("Digite o codigo do produto");
    cod = sc.nextDouble();
    System.out.println("Agora a quantidade");
    quant = sc.nextDouble();
    if(cod==1){
        cod = 4.00;
        double soma = cod*quant;
        System.out.println("Total: "+soma);
    }    
    
    else if(cod==2){
        cod = 4.50;
        double soma = cod*quant;
        System.out.println("Total: "+soma);
    }
    
 else if(cod==3){
        cod = 5.00;
        double soma = cod*quant;
        System.out.println("Total: "+soma);
    }
 else if(cod==4){
        cod = 2.00;
        double soma = cod*quant;
        System.out.println("Total: "+soma);
    }
 else if (cod==5){
        cod = 1.50;
        double soma = cod*quant;
        System.out.println("Total: "+soma);
    }
 else{
        System.out.println("Codigo errado meu parceiro");
 }


    }
    
}
