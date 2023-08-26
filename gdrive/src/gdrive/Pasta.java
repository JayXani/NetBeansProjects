
package gdrive;

import java.util.ArrayList;
import java.util.Arrays;

public class Pasta{
    public String getNomePasta() {
        return nomePasta;
    }

    private final String nomePasta;
    private final ArrayList<Arquivo> arquivos = new ArrayList<>();
    private final ArrayList<Pasta> subPastas = new ArrayList<>();
    private double lenght = 1;

    public Pasta(String nomePasta) {
        this.nomePasta = nomePasta;
    }
    public void adicionarSubpastas(Pasta supPastaNew){
        subPastas.add(supPastaNew);
    }
    public void adicionarNovosArquivos(Arquivo newArquivo){
        arquivos.add(newArquivo);
    }

    public ArrayList<Arquivo> getArquivo() {
        return arquivos;
    }

    public ArrayList<Pasta>getSubPasta() {
        return subPastas;
    }
    public void setLenght(double lenght){
        this.lenght += lenght;
    }
    public double getLenght(){return this.lenght;}
}
