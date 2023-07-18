package switcif;

import java.util.Scanner;

public class Switcif {

    public static void main(String[] args) {

  int n1;
  int n2;
  int x;
  int soma;
  Scanner sc = new Scanner(System.in);
  
        System.out.println("Digite um número");
        n1 = sc.nextInt();
        
        System.out.println("Digite outro número");
        n2 = sc.nextInt();
        
        System.out.println("Escolha uma operação: "
                +" 1 = Adição"
                + " 2 = Subtração"
                + " 3 = Multiplicação"
                + " 4 = Divisão");
        
        x = sc.nextInt();
        
        switch(x){
            case 1:
                soma = n1+n2;
                System.out.println("O resultado é "+soma);   
                break;
            case 2:
                soma = n1-n2;
                System.out.println("O resultado é "+soma);   

                break;
            case 3:
                soma = n1/n2;
                System.out.println("O resultado é "+soma);   

                break;
            case 4:
                soma = n1*n2;
                System.out.println("O resultado é "+soma);   

                break;
            default:
                System.out.println("Opção Invalida!");
                break;
        }
          
    }
    
}  