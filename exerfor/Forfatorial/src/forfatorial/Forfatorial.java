package forfatorial;

import java.util.Scanner;

public class Forfatorial {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int x;
int fat = 1;
int i;
System.out.println("Digite o numero para descobrir o seu fatorial?");
x = sc.nextInt();

for(i=1;i<=x;i++){
        fat = i*fat;
    }
    


        System.out.println("Fatorial "+fat);

    }
    
}
