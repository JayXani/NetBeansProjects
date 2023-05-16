package dao;
import java.util.ArrayList;
import projetodaescola.Professor;

public class DaoProfessor{
    ArrayList<Professor> professor = new ArrayList();
    Professor novoProfessor;

    public DaoProfessor(Professor novoProfessor) {
        this.novoProfessor = novoProfessor;
    }
    
    public void cadastrarProfessor(){
        professor.add(novoProfessor);
    }
    public void excluirProfessor(){//verificar
        
    }
}
