
package aulajava;

import java.util.Scanner;


public class Aula05 {

   static Scanner teclado = new Scanner(System.in);  //var global
    
   private static void fatWhile(){
        int f = 0;
        int i;
        
        System.out.println("Informe um valor: ");
        f = Aula05.teclado.nextInt();
            
        i = 1;
        while(f > 0){
            i *= f;
            f--;
        }
        System.out.println("O fatorial eh: " + i);
    }
      private static void fatFor(){
        int f = 0;
        int i;
        
        System.out.println("Informe um valor: ");
        f = Aula05.teclado.nextInt();
            
        i = 1;
        
        for(;f > 0;f--){
            i *= f;
        }
        System.out.println("O fatorial eh: " + i);
    }
      private static void fiboNacci(){
          
          int termo;
          int anterior = 1;
          int proximo;
          int atual = 1;
          
          System.out.println("Informe o termo: ");
          termo = Aula05.teclado.nextInt();
          
          if(termo <= 0){
              System.out.println("BOCÓ MAIOR QUE 0");
              
              return;
          }
          System.out.println(anterior + " ");
          System.out.println(atual + " ");
          
          int i = 2;
          while(i != termo){
             
            proximo = anterior + atual;
            
            System.out.println(proximo + " ");
            
            anterior = atual;
            atual = proximo;
            i++; 
          }
      }
     static void forFibonNacci(){
          
          int termo;
          int anterior = 1;
          int proximo;
          int atual = 1;
          
          System.out.println("Informe o termo: ");
          termo = Aula05.teclado.nextInt();
          
          if(termo <= 0){
              System.out.println("BOCÓ MAIOR QUE 0");
              
              return;
          }
          System.out.println(anterior + " ");
          System.out.println(atual + " ");
         
          for(int i = 2; i < termo; i++){
             
            proximo = anterior + atual;
            
            System.out.println(proximo + " ");
            
            anterior = atual;
            atual = proximo;
           
            
          }
    }
      
   
    public static void main(String[] args){
      
        System.out.println("Menu");
        
        int valor;
        valor = Aula05.teclado.nextInt();
        
        switch(valor){
            case 1:
                fatWhile();
                break;
            case 2:
                fatFor();
                break;
            case 3:
                fiboNacci();
                break;
            case 4:
                forFibonNacci();
                
            default:
                
                
        }
        
     
    }
}
