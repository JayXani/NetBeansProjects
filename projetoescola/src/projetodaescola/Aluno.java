
package projetodaescola;

public class Aluno extends Pessoa{
  
    private final int ra;

    public Aluno(int ra, String name, String endereco, String telefone, String sexo) {
        super(name, endereco, telefone, sexo);
        this.ra = ra;
    }
    
    public int getRa(){
        return ra;
    }
}