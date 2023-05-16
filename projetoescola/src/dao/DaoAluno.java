package dao;

import java.util.HashMap;
import projetodaescola.Aluno;

public class DaoAluno {

    HashMap<Integer,Aluno> aluno1 = new HashMap();

    public void cadastrarAluno(Aluno inteAluno) {
        aluno1.put(inteAluno.getRa(),inteAluno);
    }

    public void excluirAluno(int indexAluno) { //verificar
        aluno1.remove(indexAluno);
    }

    public void alterarAluno(int indexAluno) {//verificar

    }

    public Aluno pesquisarAluno(int indexRa) {//verificar
        if(aluno1.isEmpty()) return null;
        
        return aluno1.get(indexRa);
    }
}
