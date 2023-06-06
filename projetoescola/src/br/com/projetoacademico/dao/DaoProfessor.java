package br.com.projetoacademico.dao;

import br.com.projetoacademico.projetoescola.Cursos;
import java.util.HashMap;
import br.com.projetoacademico.projetoescola.Professor;
import java.util.ArrayList;


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

    public void alterarProfessor(int indexProfessor,Professor oldProfessor, Professor professorNew) {
        professor.replace(indexProfessor,oldProfessor, professorNew);
    }
    public HashMap<String,Cursos> getCursos(int register){
        return professor.get(register).getCursos();
    }
    public void cadastrarDisciplinas (String nameCurso, ArrayList<String> disciplina, int register){
        professor.get(register).getCursos().get(nameCurso).setDisciplinas(disciplina);
    }
    public ArrayList<String> getDisciplinas(String nameCourse, int register){
        for(Cursos verifyCourse : professor.get(register).getCursos().values()){
            if(verifyCourse.getNomeCurso().equals(nameCourse)){
                return verifyCourse.getDisciplinas();
            }
        }
        return null;
    }
}
