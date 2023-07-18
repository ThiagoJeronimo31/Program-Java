package jokempo;

import java.util.Random;
import java.util.Scanner;

public class Jokempo {

    public static void main(String[] args) {

int pc;
int player;
char op;
Scanner sc = new Scanner(System.in);


        System.out.println("Que tal jogar JOKEMPO?");
        
        
        do{
        Random random = new Random();
        pc = random.nextInt(3);
        
        System.out.println("Para isso, escolha as seguintes opções");
        System.out.println("0 - Pedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tesoura");
        
        System.out.println("Escolha a sua opção: ");
        player = sc.nextInt();
    switch (player) {
        case 0:
            if(player == 0 && pc == 0){
                System.out.println("EMPATE");
            }
            
            else if(player == 0 && pc == 1){
                System.out.println("VITÓRIA DO COMPUTADOR");
                System.out.println("Você escolheu"+player);
                System.out.println("O computadoes escolheu"+pc);
            }
            
            else if(player == 0 && pc == 2){
                System.out.println("VITORIA DO PLAYER! ");
                System.out.println("Você escolheu "+player);
                System.out.println("O computadoes escolheu "+pc);
                System.out.println("PARABÉNS");
            }   break;
        case 1:
            if(player == 1 && pc == 1){
                System.out.println("EMPATE");
            }
            
            else if(player == 1 && 2 == 1){
                System.out.println("VITÓRIA DO COMPUTADOR");
                System.out.println("Você escolheu "+player);
                System.out.println("O computadoes escolheu "+pc);
            }
            
            else if(player == 1 && pc == 0){
                System.out.println("VITORIA DO PLAYER! ");
                System.out.println("Você escolheu "+player);
                System.out.println("O computadoes escolheu "+pc);
                System.out.println("PARABÉNS");
            }   break;
        case 2:
            if(player == 2 && pc == 2){
                System.out.println("EMPATE");
            }
            else if(player == 2 && pc == 0){
                System.out.println("VITÓRIA DO COMPUTADOR");
                System.out.println("Você escolheu "+player);
                System.out.println("O computadoes escolheu "+pc);
            }
            else if(player == 2 && pc == 1){
                System.out.println("VITORIA DO PLAYER! ");
                System.out.println("Você escolheu "+player);
                System.out.println("O computadoes escolheu "+pc);
                System.out.println("PARABÉNS");
            }   break;
        default:
            System.out.println("Opção Incopatível");
            break;
    }
            System.out.println("Deseja continuar? (s/n)");
            op = sc.next().charAt(0);
        }while(op!='n');
        
                
        
        



    }
    
}
