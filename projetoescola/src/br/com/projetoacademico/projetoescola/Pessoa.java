package br.com.projetoacademico.projetoescola;

public class Pessoa {
    private String name;
    private String endereco;
    private String telefone;
    private String sexo;
    
    public Pessoa(String name, String endereco, String telefone, String sexo){
        this.name = name;
        this.endereco = endereco;
        this.telefone = telefone;
        this.sexo = sexo;
    }
   
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return telefone;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }

}
