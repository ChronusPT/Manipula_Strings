
package manip_stg;

import java.util.Scanner;

public class Manip_Stg {

   public static Scanner ler = new Scanner (System.in);
   
    public static void main(String[] args) {
        
        int op;
        
        do {
            System.out.println(">>>>>>>>>MENU<<<<<<<<<");
            System.out.println("1  - Tamanho String :");
            
            System.out.println("0 - Sair");
            System.out.println("Insira a opção pretendida");
            op = ler.nextInt ();
            
            switch (op){
                case 0: break;
                case 1:
                    System.out.println("A string inserida tem: "+ ExerciciosString.contaCaracteres()+ " caracteres");
                    break;
                default:
                    System.out.println("Insira opção valida");
            }
            
            
        }while (op != 0);
    
    }
    
}
