/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogode21;

import java.util.ArrayList;


/**
 *
 * @author FATEC
 */
public class Cartas {
    ArrayList<Carta> cartas = new ArrayList<>();
    
    public int getSoma() {
        int soma = 0;
        for(Carta carta : cartas) {
            soma += carta.valor;
        }
        return soma;
    }
}
