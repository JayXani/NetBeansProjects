
package dal;
import java.util.ArrayList;
import projetodaescola.Aluno;


public class DalAluno {
    ArrayList <Aluno> Aluno1 = new ArrayList<>();
    
    public void cadastrarAluno(Aluno inteAluno){
        Aluno1.add(inteAluno);   
    }
    
    public void excluirAluno(int indexAluno){ //verificar
        Aluno1.remove(indexAluno);
    }
    public void alterarAluno(int indexAluno){//verificar
        
    }
    public Aluno pesquisarAluno(int indexRa){//verificar
        Aluno alunoPesquisa = null;
        for(int i = 0; i < Aluno1.size(); i++){
            alunoPesquisa = Aluno1.get(i);
            if(alunoPesquisa.getRa() == indexRa){
                alunoPesquisa = Aluno1.get(i);
                
            }else{
                System.out.println("Aluno não encontrado");
            }
        }
        return alunoPesquisa;
    }
}
