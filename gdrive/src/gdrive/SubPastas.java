
package gdrive;

import java.util.ArrayList;

public class SubPastas {
    String nomeSubpastas;
    ArrayList <Arquivo> novoArquivo = new ArrayList();
    

    public SubPastas(String nomeSubpastas) {
        this.nomeSubpastas = nomeSubpastas;
    }
    public void adicionarArquivos(Arquivo addArquivo){
        novoArquivo.add(addArquivo);
    }
}
