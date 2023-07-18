package telefif;

import java.util.Scanner;


public class Telefif {

    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 
 double hor; 
 double sub;
 double soma;
 
      System.out.println("Quantos minutos você utilizou o telefone? ");
      hor = sc.nextDouble();
        
      if(hor<=100){
          System.out.println("Valor a pagar: R$ 50.00");
      }  
      else{
          sub = (hor - 100) * 2;
          soma = sub + 50;
          System.out.println("Valor a pagar: "+soma);
      }
 

    }
    
}
