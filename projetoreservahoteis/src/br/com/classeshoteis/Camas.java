/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classeshoteis;

/**
 *
 * @author Fatec
 */
public class Camas {
    private final String tipoCama;
    private final int quantidadeCamas;

    public Camas(String tipoCama, int quantidadeCamas) {
        this.tipoCama = tipoCama;
        this.quantidadeCamas = quantidadeCamas;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public int getQuantidadeCamas() {
        return quantidadeCamas;
    }

}
