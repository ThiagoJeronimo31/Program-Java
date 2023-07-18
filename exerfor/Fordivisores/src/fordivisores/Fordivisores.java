package fordivisores;

import java.util.Scanner;

public class Fordivisores {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int x;
int i;
int div = 0;
System.out.println("Digite um número, para descobrir o seu divisor: ");
x = sc.nextInt();

for(i=0;i<=x;i++){
    div++;
    if(x%div==0){
        
        System.out.println(div);
    }
}

    }
    
}
