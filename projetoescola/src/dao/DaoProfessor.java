package dao;

import java.util.HashMap;
import projetodaescola.Professor;

public class DaoProfessor {

    HashMap<Integer, Professor> professor = new HashMap();

    public void cadastrarProfessor(Professor novoProfessor) {
        professor.put(novoProfessor.getRegistro(), novoProfessor);
    }

    public void excluirProfessor(int registroDeExclusao) {
        professor.remove(registroDeExclusao);
    }

    public Professor pesquisarProfessor(int registroSearch) {
        return (professor.isEmpty() ? null : professor.get(registroSearch));
    }

    public HashMap pesquisarFULLprofessor() {
        return (professor.isEmpty() ? null : professor);
    }

    public void alterarProfessor() {

    }
}
