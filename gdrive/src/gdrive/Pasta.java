
package gdrive;

import java.util.ArrayList;

public class Pasta{
    String nomePasta;
    ArrayList<Arquivo> novoArquivo = new ArrayList();
    ArrayList<SubPastas> novaSubPasta = new ArrayList();
    SubPastas subpasta;
    Arquivo newDadosArquivos;

    public Pasta(String nomePasta) {
        this.nomePasta = nomePasta;
    }
    public void adicionarSubpastas(String nomeSubpasta){
        subpasta = new SubPastas(nomeSubpasta);
        novaSubPasta.add(subpasta);
    }
    public void adicionarNovosArquivos(Arquivo newArquivo){
        novoArquivo.add(newArquivo);
    }
}
