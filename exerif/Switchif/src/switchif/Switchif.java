package switchif;

import java.util.Scanner;

public class Switchif {
    public static void main(String[] args) {

        int x; 
        String dia;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Digite o dia da Semana");
        x = sc.nextInt();
        
        switch (x){
            case 1:
               dia = "Domingo";
               break;
            case 2:
               dia = "Segunda-Feira";
               break;
               
            case 3:
                dia = "Terça-Feira";
                break;
            
            case 4:
                dia = "Quarta-Feira";
                break;
                
            case 5:
                dia = "Quinta-Feira";
                break;
            
            case 6:
                dia = "Segunda-Feira";
                break;
                
            case 7:
                dia = "Sabado";
                break;
            
            default:
                dia = "Dia Invalido!";
                break;
        }
        
        System.out.println("Dia da Semana: "+ dia);

    }
    
}
