
package projetodaescola;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private final int registroProf;
    ArrayList<String> disciplinas = new ArrayList();
    
    public Professor(int registroProf, String name, String endereco, String telefone, String sexo, ArrayList<String> disciplinas) {
        super(name, endereco, telefone, sexo);
        this.registroProf = registroProf;
        this.disciplinas = disciplinas;
    }
    public ArrayList<String> getDisciplinas(){
        return disciplinas;
    }
    public int getRegistro(){
        return registroProf;
    }
    
}
