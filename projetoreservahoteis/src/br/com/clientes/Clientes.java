
package br.com.clientes;

import java.util.ArrayList;

public class Clientes {
    private final String nome;
    private final String dataNascimento;
    private final String CPF;
    private final ArrayList<Integer> idHospedesQuarto;
    
    public Clientes(String nome, String dataNascimento, String CPF,ArrayList<Integer> idHospedesQuarto){
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.idHospedesQuarto = idHospedesQuarto;
    }
    
    public String getNome(){
        return nome;
    }
    public String getCPF(){
        return CPF;
    }
    public String getDataNascimento(){
        return dataNascimento;
    }

    
}
