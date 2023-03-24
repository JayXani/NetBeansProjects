/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajavamaior;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Danilo
 */
    /*  coutTokens me retorna a quantidade de tokens que ele quebrou
        hasMoreTokens (enquanto tiver um token)
        new int[st.countTokens] cria um vetor com o tamanho da String, quando o usuario digitar o ultimo valor
        eu transformo isso em inteiro e coloco como parametro no vetor.
    */
public class Numeros {

    int vet[];

    void lerValores() {
        Scanner teclado = new Scanner(System.in);
        String aux = "";
        String finalizador;

        System.out.println("Informe os valores:");

        do {
            finalizador = teclado.next();
            if (!finalizador.equals("fim")) {
                
                aux += finalizador + " "; //Aqui ele vai concatenar o valor da variavel com a string

            }
        } while (!finalizador.equals("fim"));

        StringTokenizer st = new StringTokenizer(aux);

        //pegando a quantidade de valores digitados e transformando em parametro
        vet = new int[st.countTokens()];

        for (int i = 0; i < vet.length; i++) {

            //despejando os valores digitados no vetor
            vet[i] = Integer.parseInt(st.nextToken());

        }
    }

    int getMaior() {
        int maior = 0;
        for(int i = 0; i < vet.length; i++){
            if(i == 0) maior = vet[i];
            if(vet[i] > maior) maior = vet[i];
        }
        return maior;
    }
    int getMenor(){
        int menor = 0;
        for(int i = 0 ; i < vet.length; i++){
            if(i == 0) menor = vet[i];
            if(vet[i] < menor) menor = vet[i];
        }
        return menor;
    }
    void ordemValores(){
        Arrays.sort(vet);
        System.out.println("A ordem dos valores sao: " + Arrays.toString(vet));
    }
    void multiplicacaoValores(int valor){
        System.out.println("Valores multiplicados em ordem: ");
        for(int i = 0; i < vet.length; i++){
            vet[i] *= valor;
            System.out.println(vet[i]);
        }
    }
    

}
