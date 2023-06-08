
package br.com.projetoacademico.projetoescola;

import java.util.ArrayList;


public final class Cursos {
    private final String nomeCurso;
    private ArrayList <String> disciplinas = new ArrayList();
    
    public Cursos(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
    
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setDisciplinas(ArrayList <String> disciplinas){
        this.disciplinas = disciplinas;
    }
    public void addDisciplinasInArray(String addDisciplinas){
        disciplinas.add(addDisciplinas);
    }
    public ArrayList<String> getDisciplinas(){
        return disciplinas;
    }
}
