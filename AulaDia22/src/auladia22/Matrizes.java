
package auladia22;

import java.util.Scanner;

public class Matrizes {
    public void somarMatrizes(){
        int[][] matriz, matriz2, soma;
 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe as dimensões da matriz: ex 3x3");
        
        String aux =teclado.next();
        
           
        matriz = new int[Integer.parseInt(aux.split("x")[0])][Integer.parseInt(aux.split("x")[1])];
        matriz2 = matriz;    //[0][1] é os indices do vetor de split
        soma = matriz;
        
        System.out.println("Informe os valores da 1º matriz: ");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                matriz1[j] = teclado.nextInt();
            }
        }
        System.out.print("\nInforme os valores da 2º matriz: ");
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0;j <  matriz2.length; j++){
                matriz2[i][j] = teclado.nextInt();
                soma[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }
        System.out.println("A soma dos valores eh: ");
        for (int[] soma1 : soma) {
            System.out.print("\n");
            for(int j = 0; j < soma.length; j++){
               
                System.out.print(soma1[j] + " ");
            }
        }
    }
    
    public void subtrairMatrizes(){
        int[][] matriz, matriz2, subtracao;
 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe as dimensões da matriz: ex 3x3");
        
        String aux = teclado.next();
        
           
        matriz = new int[Integer.parseInt(aux.split("x")[0])][Integer.parseInt(aux.split("x")[1])];
        matriz2 = new int[Integer.parseInt(aux.split("x")[0])][Integer.parseInt(aux.split("x")[1])];  //[0][1] é os indices do vetor de split
        subtracao = new int[Integer.parseInt(aux.split("x")[0])][Integer.parseInt(aux.split("x")[1])];
        
        System.out.println("Informe os valores da 1º matriz: ");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                matriz1[j] = teclado.nextInt();
            }
        }
        System.out.print("\nInforme os valores da 2º matriz: ");
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0;j <  matriz2.length; j++){
                matriz2[i][j] = teclado.nextInt();
                subtracao[i][j] = matriz[i][j] - matriz2[i][j];
            }
        }
        System.out.println("A subtracao dos valores eh: ");
        for (int[] subtracao1 : subtracao) {
            System.out.print("\n");
            for(int j = 0; j < subtracao.length; j++){
               
                System.out.print(subtracao1[j] + " ");
            }
        }
    }
    public void multiplicacaoMatriz(){
        
    }
}
