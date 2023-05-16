package dao;

import java.util.HashMap;
import projetodaescola.Professor;

public class DaoProfessor{
    HashMap <Integer,Professor> professor = new HashMap();
    
    public void cadastrarProfessor(Professor novoProfessor){
        professor.put(novoProfessor.getRegistro(), novoProfessor);
    }
    public void excluirProfessor(int registroDeExclusao){
        professor.remove(registroDeExclusao);
    }
    public Professor pesquisarProfessor(int registroSearch){
        if(professor.isEmpty()) return null;
        return professor.get(registroSearch);
    }
    public void alterarProfessor(){
        
    }
}
