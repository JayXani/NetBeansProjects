
package auladia22;

import java.util.Scanner;

public class Matrizes {
    Scanner teclado = new Scanner(System.in);
    public void somarMatrizes(){
          
        int[][] matriz, matriz2, soma;
        
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
        System.out.println();
    }
    
    public void subtrairMatrizes(){
        int[][] matriz, matriz2, subtracao;
 
       
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
        System.out.println();
    }
    public void multiplicacaoMatriz(){
        int[][] matrizA, matrizB;
        int linhaA, colunaA, linhaB, colunaB;
        
        System.out.print("Informe a quantidade de linhas da matriz: ");
        linhaA = teclado.nextInt();
        
        System.out.print("Informe a quantidade de COLUNAS da matriz: ");
        colunaA = teclado.nextInt();
        linhaB  = linhaA;
        colunaB = colunaA;
        
        matrizA = new int[linhaA][colunaA];
        matrizB = new int[linhaB][colunaB];
        
        System.out.println("Informe os valores da matriz A: ");
        for (int[] matrizA1 : matrizA) {
            for(int j = 0; j < colunaA; j++){
                matrizA1[j] = teclado.nextInt();
            }
        }
        
        System.out.println("\nInforme os valores da matriz B: ");
        for(int[] matrizB1 : matrizB){
            for(int j = 0; j < colunaB; j++){
                matrizB1[j] = teclado.nextInt();
            }
        }
        int matrizC[][] = new int[linhaA][colunaB];
        if(matrizA[0].length == matrizA.length){
                
            for(int i = 0; i < linhaA; i++){
                for(int j = 0; j < colunaB; j++){
                    for(int k = 0; k < linhaB; k++){
                        matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }
        }else{
            System.out.println("Impossivel realizar a multiplicacao");
        }
        System.out.println("A multiplicacao dos valores");
        for (int[] matrizResultado : matrizC) {
            System.out.println();
            for(int j = 0;j < matrizResultado.length; j++){
                System.out.print(matrizResultado[j] + " ");
            }
        }
        System.out.println();
    }
    
}
