// Split repressão regulares (* 0 ou mais) (a+ 1 ou mais As) ([a-z] entre a e z)
//int[] matriz[], alguma
//matriz vira um vetor bidimensional, alguma viraria um vetor
/*
    for(int i = 0; i < 2; i++){
                
        matriz[i] = new int[3];
        basicamente a cada linha estou adicionando uma nova coluna
                
    }

    matriz[0].lenght  matriz na dimensão 0
*/
package auladia22;

import java.util.Scanner;

public class AulaDia22 {

    public static void main(String[] args) {
       
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        String menu = " 1) Soma de matrizes \n 2) Subtracao de matrizes \n 3)Multiplicacao de matrizes \n";
        
        System.out.println("Escolha uma opcao deseja: \n" + menu);
        while (opcao == 0) {
            Matrizes m1 = new Matrizes();
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    m1.somarMatrizes();
                    break;
                case 2:
                    m1.subtrairMatrizes();
                    break;
                case 3: 
                    m1.multiplicacaoMatriz();
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
       
        
    }
    
}
