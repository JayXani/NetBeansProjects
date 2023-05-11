
package br.com.clientes;

public class Clientes {
    private final String nome;
    private final String dataNascimento;
    private final String CPF;
    
    public Clientes(String nome, String dataNascimento, String CPF){
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
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
