
package projetodaescola;

import java.util.ArrayList;

public final class Cursos {
    private final String nomeCurso;
    private final ArrayList <String> disciplinas;
    
    public Cursos(String nomeCurso, ArrayList<String> disciplinas){
        this.nomeCurso = nomeCurso;
        this.disciplinas = disciplinas;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
    public void getDisciplinas(){

    }
}
