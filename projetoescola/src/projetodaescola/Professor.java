
package projetodaescola;

import java.util.ArrayList;

public final class Professor extends Pessoa{
    private final int registroProf;
    ArrayList<Cursos> disciplinas = new ArrayList();
    
    public Professor(int registroProf, String name, String endereco, String telefone, String sexo, ArrayList<Cursos> disciplinas) {
        super(name, endereco, telefone, sexo);
        this.registroProf = registroProf;
        this.disciplinas = disciplinas;
    }
    public ArrayList<Cursos> getDisciplinas(){
        return disciplinas;
    }
    public int getRegistro(){
        return registroProf;
    }
    
}
