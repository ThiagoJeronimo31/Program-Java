package forimpar;

import java.util.Scanner;

public class ForImpar {
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 
 int x;
 int i;
 
        System.out.println("Digite um número, para ver seus impares");
        x = sc.nextInt();
        
        for(i=0;i<x;i++){
            if(i%2==0){
                i++;
                System.out.println(i);
            }
        }
 

    }
    
}
