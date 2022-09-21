
package manip_stg;


class ExerciciosString {
    
    static String s,s1;
    static void leStrings(String texto){
        
        System.out.println(texto);
        s = Manip_Stg.ler.next();
        s1 = Manip_Stg.ler.nextLine();
        s = s + s1;
    }

    static int contaCaracteres() {
        
        leStrings("Insira um texto");
        return s.length(); 
        
    }

    static void ArvoreLetras() {
        
        int x,y;
        
        leStrings("Insira uma palavra");
        
        for (x = 0; x < s.length(); x++ ) {// controla as linhas
            for (y = 0; y <= x; y++ ) {// precorre colunas
                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
        
        for (x = s.length()-1; x >= 0; x--) {
            for (y = 0; y < x; y++ ) {
                System.out.print(s.charAt(y));  
            }
            System.out.println();  
        }
        
    }

    static void capitalizaLetras() {
        
        
        leStrings("Insira uma palavra em minusculas :");
        
        System.out.println(s.toUpperCase());
        
        leStrings ("Insira uma palavra em maiusculas :");
        
        System.out.println(s.toLowerCase());
        
           
    }
    
}
