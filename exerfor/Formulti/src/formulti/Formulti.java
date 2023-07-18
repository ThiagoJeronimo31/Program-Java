package formulti;

import java.util.Scanner;

public class Formulti {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int x;
int i;


        System.out.println("Digite um número ai: ");
        x = sc.nextInt();
        
        for(i=1;i<=x;i++){
            int pri = i;
            int seg = i*i;
            int ter = i*i*i;
            
            System.out.println(pri);
            System.out.println(seg);
            System.out.println(ter);
            
           
        
        }


    }
    
}
