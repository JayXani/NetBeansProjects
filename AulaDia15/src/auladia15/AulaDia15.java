
package auladia15;
import java.util.Scanner;

public class AulaDia15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String aux;
        int intermediador;
        int maior = 0;
        int menor = 0;
       
        System.out.println("Informe alguns valores: ");     
        do{
            aux = teclado.next();
            
            if(!aux.equals("fim")){
                intermediador = Integer.parseInt(aux); 
                menor = intermediador;
                if(intermediador >= maior){
                    maior = intermediador;
                    
                }
                if(menor <= menor){
                    menor = intermediador;
            
                }
            }   
        }while(!aux.equals("fim"));
        
        System.out.println(maior);
        System.out.println(menor);
    
        
    }
}
