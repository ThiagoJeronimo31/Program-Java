package forinout;

import java.util.Scanner;

public class Forinout {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int x;
int in = 0;
int out = 0;
int i;
int num;
        System.out.println("Digite um número");
        x = sc.nextInt();
        
        for(i=0;i<x;i++){
            System.out.println("Vamos lá: ");
            num = sc.nextInt();
            
            if(num>=10 && num<=20){
            in++;
        }    
            else{
                out++;
            }
        }
        System.out.println("in "+in);
        
        System.out.println("out "+out);
        
        



    }
    
}
