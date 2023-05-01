/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogode21;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author FATEC
 */
public class Baralho {
    ArrayList<Carta> cartas = new ArrayList<Carta>();
    
    public Baralho() {
        for(int i = 1; i <= 10; i++) {
            for(int j = 0; j < 4; j++) {
                this.cartas.add(new Carta(              //para cada interação eu crio uma nova instância de carta, ou seja, uma nova carta
                        
                        i == 1 ? "A" : Integer.toString(i),                       
                        j == 0 ? "♥" : j == 1 ? "♤" : j == 2 ? "♧" : "♢",       //Aqui estou atribuindo cada caracter para meu valor de i
                        i
                ));
            }
        }
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                this.cartas.add(new Carta(
                        i == 0 ? "Q" : i == 1 ? "J" : "K",          //Aqui já envio os caracteres
                        j == 0 ? "♥" : j == 1 ? "♤" : j == 2 ? "♧" : "♢",
                        10
                ));
            }
        }
    }
    
    public Carta pegarCarta() {
        Random random = new Random();
        int randomic = random.nextInt(cartas.size());
        Carta selected = cartas.get(randomic);  //estou pegando um valor aleatorio entre todas as cartas e adicionando em selected
        
        cartas.remove(randomic);    //Aqui basicamente estou tirando uma carta do baralho
        
        return selected;
    }
}
