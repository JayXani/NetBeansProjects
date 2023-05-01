/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogode21;

import java.util.Scanner;

/**
 *
 * @author FATEC
 */

public class Geral {

    public static void main(String[] args) {
        Cartas usrCartas = new Cartas();
        Cartas botCartas = new Cartas();
        Baralho baralho = new Baralho();
        Scanner teclado = new Scanner(System.in);
        String aux = "";
        System.out.println("JOGAR 21");
        
        do {
            System.out.println("Quer uma carta? (Sim ou Nao)");
            aux = teclado.next();
            if(!aux.equals("Nao")) {
                
                Carta carta = baralho.pegarCarta();     //Vai me retornar selected, a carta selecionada
                
                System.out.println("Carta: " + carta.caracter + carta.tipo);
                usrCartas.cartas.add(carta);    //Adiciono a carta em cartas, onde está meu metodo soma
                
                System.out.println("Soma atual: " + usrCartas.getSoma());   //Vai somar a carta e me retornar o valor da soma
            }
        } while(!aux.toUpperCase().equals("NAO") && usrCartas.getSoma() < 21);      //Somente uma das condições precisa ser verdadeira
        
        if(usrCartas.getSoma() < 21) {
            System.out.println("BOT");
            while(botCartas.getSoma() <= usrCartas.getSoma()) {
                Carta carta = baralho.pegarCarta();
                System.out.println("Carta: " + carta.caracter + carta.tipo);        /*Caracter exibe o valor da carta: 1 2 K, J etc
                                                                                      tipo = copas, ouro etc.*/
                botCartas.cartas.add(carta);
            }
            System.out.println("Soma atual bot: " + botCartas.getSoma());
        }
        
        if(usrCartas.getSoma() == 21 || botCartas.getSoma() > 21) System.out.println("Você ganhou!!");
        else if(usrCartas.getSoma() == botCartas.getSoma()) System.out.println("Empate!");
        else System.out.println("Bot ganhou!!");
        System.out.println("VOCÊ: " + usrCartas.getSoma());
        System.out.println("BOT: " + botCartas.getSoma());
    }
    
}
