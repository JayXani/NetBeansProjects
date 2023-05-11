/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classeshoteis;


import br.com.clientes.Clientes;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author Fatec
 */
public class ReservaQuarto extends Quartos{
    ArrayList <Quartos> quartoReservado = new ArrayList();
    public ReservaQuarto(ArrayList<Clientes> hospedes,ArrayList<Camas> novaCama, boolean frigobar, boolean Sacada, boolean banheiroPrivativo, boolean tv, double precoDiaria,LocalDate chekIN, LocalDate chekOUT) {
        super(hospedes, novaCama, frigobar, Sacada, banheiroPrivativo, tv, precoDiaria,chekIN, chekOUT);
    }
    
    public void reservaRealizada(Quartos quarto){
       quartoReservado.add(quarto);
    }
    public void informacoesCliente(){
        
    }
}
