package pkgwhile;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 
int x = sc.nextInt();
int y = 0;
while(x!=0){
   y+=x;
    
   x = sc.nextInt();
    
}
        System.out.println(y);
sc.close();

    }
    
}
