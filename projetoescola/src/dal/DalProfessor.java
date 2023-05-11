package dal;
import java.util.ArrayList;
import projetodaescola.Professor;

public class DalProfessor{
    ArrayList<Professor> professor = new ArrayList();
    Professor novoProfessor;

    public DalProfessor(Professor novoProfessor) {
        this.novoProfessor = novoProfessor;
    }
    
    public void cadastrarProfessor(){
        professor.add(novoProfessor);
    }
    public void excluirProfessor(){//verificar

    }
}
