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
public class Quartos{
    
    final ArrayList<Clientes> hospedes;
    private final ArrayList<Camas> camas;
    private final boolean frigobar;
    private final boolean Sacada;
    private final boolean banheiroPrivativo;
    private final boolean tv;
    private final double precoDiaria;
    private final LocalDate chekIN;
    private final LocalDate chekOUT;
    public Quartos(ArrayList<Clientes> hospedes,ArrayList<Camas> novaCama, boolean frigobar, boolean Sacada, boolean banheiroPrivativo, boolean tv, double precoDiaria, LocalDate chekIN, LocalDate chekOUT) {
        this.camas = novaCama;
        this.hospedes = hospedes;
        this.frigobar = frigobar;
        this.Sacada = Sacada;
        this.banheiroPrivativo = banheiroPrivativo;
        this.tv = tv;
        this.precoDiaria = precoDiaria;
        this.chekIN = chekIN;
        this.chekOUT = chekOUT;
    }

    public ArrayList<Clientes> getNumeroHospedes() {
        
        return hospedes;
    }
    public ArrayList<Camas> getQuantidadeCamas(){
        return camas;
    }
     
    public boolean getFrigobar() {
        return frigobar;
    }

    public boolean getSacada() {
        return Sacada;
    }

    public boolean getBanheiroPrivativo() {
        return banheiroPrivativo;
    }

    public boolean getTv() {
        return tv;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }
    
}
