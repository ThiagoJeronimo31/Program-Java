package impar;

import java.util.Scanner;

public class Impar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        
        int num;
        String resul;
        
System.out.println("Impar ou Par?");
    
System.out.println("Digite um número: ");
num = sc.nextInt();

resul = (num%2==0)? "Par": "Impar"; 
System.out.println(resul);

    }
    
}
