
package projetodaescola;

import java.util.ArrayList;

public class Cursos {
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
        String teste = disciplinas.get(0);
        System.out.println(teste);
    }
}
