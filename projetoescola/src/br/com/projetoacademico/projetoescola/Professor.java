
package br.com.projetoacademico.projetoescola;
import java.util.ArrayList;


public final class Professor extends Pessoa{
    private final int registroProf;
    
    private final ArrayList<Cursos> coursesProfessor = new ArrayList();
    
    public Professor(int registroProf, String name, String endereco, String telefone, String sexo) {
        super(name, endereco, telefone, sexo);
        this.registroProf = registroProf;
        
    }
    public void setCourses(Cursos addANewCourse){
        coursesProfessor.add(addANewCourse);
    }
    public void addDisiciplinas(String nameCourse, ArrayList <String> disciplinas){
        for(Cursos searchCourse : coursesProfessor){
            if(searchCourse.getNomeCurso().equals(nameCourse)){
                searchCourse.setDisciplinas(disciplinas);
            }
        }
    }
    
    public ArrayList<Cursos> getCoursesProfessor() {
        return coursesProfessor;
    }
    
    public ArrayList<String> getDisciplinas(String nameCourse){
        for(Cursos searchCourse : coursesProfessor){
            if(searchCourse.getNomeCurso().equals(nameCourse)){
                return searchCourse.getDisciplinas();
            }
        }
        return null;
    }
    public int getRegistro(){
        return registroProf;
    }
}
