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
    public Cursos getAllCourses(String nameCourse, int register){
        return professor.get(register).searchCursos(nameCourse);
    }
    public void cadastrarCursos(String nameCourse , Cursos addCourse, int registerProfessor){
        if(professor.get(registerProfessor) != null){
            professor.get(registerProfessor).setCursos(nameCourse, addCourse);
        }
    }
    public Cursos searchCursos(String nameCourse, int registerProfessor){
        if(professor.get(registerProfessor) != null){
            return professor.get(registerProfessor).searchCursos(nameCourse);
        }
        return null;
    }
    
    public void cadastrarDisciplinas (String nameCurso, ArrayList<String> disciplina, int register){
        if(professor.get(register) != null){
            if(professor.get(register).searchCursos(nameCurso) != null){
                professor.get(register).searchCursos(nameCurso).setDisciplinas(disciplina);
            }
            System.out.println(professor.get(register).searchCursos(nameCurso).getDisciplinas());
        }
    }
    
    public ArrayList<String> getDisciplinas(String nameCourse, int register){
       if(professor.get(register) != null){
            if(professor.get(register).searchCursos(nameCourse) != null){
                return professor.get(register).searchCursos(nameCourse).getDisciplinas();
            }
        }
       return null;
    }
}
