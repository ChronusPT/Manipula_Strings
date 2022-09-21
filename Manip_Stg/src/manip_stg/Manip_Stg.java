
package manip_stg;

import java.util.Scanner;

public class Manip_Stg {

   public static Scanner ler = new Scanner (System.in);
   
    public static void main(String[] args) {
        
        int op;
        
        do {
            System.out.println(">>>>>>>>>MENU<<<<<<<<<");
            System.out.println("1 - Tamanho String :");
            System.out.println("2 - Arvore de letras ");
            System.out.println("3 - Capitalização de Letras ");
            
            System.out.println("0 - Sair");
            System.out.println("Insira a opção pretendida");
            op = ler.nextInt ();
            
            switch (op){
                case 0: break;
                case 1:
                    System.out.println("A string inserida tem: "+ ExerciciosString.contaCaracteres()+ " caracteres");
                    break;
                case 2:
                    ExerciciosString.ArvoreLetras();
                    break;
                case 3:
                    ExerciciosString.capitalizaLetras();
                    break;
                default:
                    System.out.println("Insira opção valida");
            }
            
            
        }while (op != 0);
    
    }
    
}
