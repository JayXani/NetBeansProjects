package dao;

import java.util.HashMap;
import projetodaescola.Aluno;

public class DaoAluno {

    HashMap<Integer, Aluno> aluno = new HashMap();

    public void cadastrarAluno(Aluno inteAluno) {
        aluno.put(inteAluno.getRa(), inteAluno);
    }

    public void excluirAluno(int indexAluno) { //verificar
        aluno.remove(indexAluno);
    }

    public Aluno pesquisarAluno(int indexRa) {//verificar
       return (aluno.isEmpty()? null : aluno.get(indexRa));
    }

    public HashMap pesquisarFullAluno() {
        return (aluno.isEmpty()? null : aluno);
    }

    public void alterarAluno(int indexAluno) {//verificar

    }

}
