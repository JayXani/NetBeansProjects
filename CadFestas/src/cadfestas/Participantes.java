package cadfestas;

import java.util.ArrayList;

public class Participantes {
    private final String nomeParticipante;
    ArrayList<String> perguntas;
    ArrayList<String> respostas;

    public Participantes(String nomeParticpante, ArrayList<String> perguntas, ArrayList<String> respostas) {
        this.nomeParticipante = nomeParticpante;
        this.perguntas = perguntas;
        this.respostas = respostas;
    }
    public String getNome(){
        return nomeParticipante;
    }
    public ArrayList<String> getPerguntas() {
        return perguntas;
    }
    
    public ArrayList<String> getRespostas() {
        return respostas;
    }

}
