
package manip_stg;


class ExerciciosString {

    static int contaCaracteres() {
        
        String s,s1;
        System.out.println("Insira um texto");
        s = Manip_Stg.ler.next();
        s1 = Manip_Stg.ler.nextLine();
        s = s + s1;
        return s.length(); 
        
    }
    
}
