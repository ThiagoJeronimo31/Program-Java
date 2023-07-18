package fordivisao;

import java.util.Scanner;

public class Fordivisao {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int x;
int i;
int num1;
int num2;
double div;
    System.out.println("Digite o valor de x");
    x = sc.nextInt();
    
    for(i=0;i<x;i++){
        System.out.println("Primeiro número");
        num1 = sc.nextInt();
        
        System.out.println("Segundo número");
        num2 = sc.nextInt();
        
        if(num2==0){
            System.out.println("Divisão impossível");
        }
        else{
            div = num1/num2;
            System.out.println(div);
        }
        
    }
        

    }
    
}
