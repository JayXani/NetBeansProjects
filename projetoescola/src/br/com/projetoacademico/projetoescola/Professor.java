
package br.com.projetoacademico.projetoescola;

import java.util.ArrayList;
import java.util.HashMap;

public final class Professor extends Pessoa{
    private final int registroProf;
    HashMap<String,Cursos> cursos = new HashMap();

    public Professor(int registroProf, String name, String endereco, String telefone, String sexo) {
        super(name, endereco, telefone, sexo);
        this.registroProf = registroProf;
        
    }
    public void setCursos(HashMap<String,Cursos> cursos){
        this.cursos = cursos;
    }
    public HashMap<String,Cursos> getCursos(){
        return cursos;
    }
    public int getRegistro(){
        return registroProf;
    }
}
