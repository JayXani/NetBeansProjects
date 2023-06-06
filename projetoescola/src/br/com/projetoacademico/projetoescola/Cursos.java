
package br.com.projetoacademico.projetoescola;

import java.util.ArrayList;


public final class Cursos {
    private final String nomeCurso;
    private ArrayList <String> disciplinas;
    
    public Cursos(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
    
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setDisciplinas(ArrayList <String> disciplinas){
        this.disciplinas = disciplinas;
    }
    public ArrayList<String> getDisciplinas(){
        return disciplinas;
    }
}
