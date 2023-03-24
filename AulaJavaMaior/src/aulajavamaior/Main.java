
package aulajavamaior;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
        Numeros N1 = new Numeros();
        Scanner teclado = new Scanner(System.in);
        N1.lerValores();
        System.out.println("O maior valor eh: " + N1.getMaior());
        System.out.println("O menor valor eh: " + N1.getMenor());
        N1.ordemValores();
        System.out.print("Informe um valor para multiplicacao: ");
        N1.multiplicacaoValores(teclado.nextInt());

    }
    

}
