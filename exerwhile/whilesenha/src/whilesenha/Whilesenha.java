package whilesenha;

import java.util.Scanner;

public class Whilesenha {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int sen;
int senha = 2002;


    System.out.println("Digite a senha: ");
    sen = sc.nextInt();
    
    while(sen!=senha){
        System.out.println("Senha Invalida");
        System.out.println("Digite Novamente: ");
        sen = sc.nextInt();
    }
        System.out.println("Acesso Permitido");

    }
    
}
