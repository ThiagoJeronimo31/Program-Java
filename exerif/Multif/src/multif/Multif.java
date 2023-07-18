
package multif;

import java.util.Scanner;

public class Multif {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n1;
int n2; 

System.out.println("Verificando se eles são multiplos");
        
    System.out.println("Digite um número aleatório");
    n1 = sc.nextInt();
    System.out.println("Digite outro número");
    n2 = sc.nextInt();
    if(n1%n2==0 || n2%n1 ==0 ){
        System.out.println("São Multiplos");
    }
    else{
        System.out.println("Não são Multiplos");
    }
    
    }
    
}
