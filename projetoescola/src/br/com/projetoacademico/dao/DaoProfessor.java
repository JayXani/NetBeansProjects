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

    public void alterarProfessor(int indexProfessor, Professor oldProfessor, Professor professorNew) {
        professor.replace(indexProfessor, oldProfessor, professorNew);
    }
    public void cadastrarCursos (int recordProfessor, Cursos newCurso){
        professor.get(recordProfessor).setCourses(newCurso);
    }
    public void cadastrarDisciplinas(int recordProfessor,String nameCourse,ArrayList <String> disciplinas){
        if(professor  != null){
            professor.get(recordProfessor).addDisiciplinas(nameCourse, disciplinas);
        }
    }
    public ArrayList<Cursos> getCourses(int registroProfessor) {
        return professor.get(registroProfessor).getCoursesProfessor();
    }
    
    public ArrayList<String> getDisciplinas(String nameCourse, int registerProfessor){
        if(professor != null){
            return professor.get(registerProfessor).getDisciplinas(nameCourse);
        }
        return null;
    }
}
