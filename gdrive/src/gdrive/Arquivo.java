
package gdrive;

public class Arquivo {
    private String nomeArquivo;
    private String tipoArquivo;
    private double tamanhoArquivo;

    public Arquivo(String nomeArquivo, String tipoArquivo, double tamanhoArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.tipoArquivo = tipoArquivo;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public String getTipoArquivo() {
        return tipoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }
}
