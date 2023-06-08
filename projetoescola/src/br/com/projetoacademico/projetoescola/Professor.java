
package br.com.projetoacademico.projetoescola;

import java.util.HashMap;

public final class Professor extends Pessoa{
    private final int registroProf;
    HashMap<String,Cursos> cursos = new HashMap();

    public Professor(int registroProf, String name, String endereco, String telefone, String sexo) {
        super(name, endereco, telefone, sexo);
        this.registroProf = registroProf;
        
    }
    public void setCursos(String nameCourse,Cursos addCourse){
        cursos.put(nameCourse,addCourse);
    }
    public Cursos searchCursos(String nameCourse){
        if(cursos.get(nameCourse) != null){
            return cursos.get(nameCourse);
        }
        return null;
    }
    public int getRegistro(){
        return registroProf;
    }
}
