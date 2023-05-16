package cadfestas;

import java.util.ArrayList;

public class Festas {
    private final String nome;
    private final String descricao;
    ArrayList <Participantes> arrayParticipantes = new ArrayList();

    public Festas(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public ArrayList <Participantes> getNovoParticipante() {
        return arrayParticipantes;
    }

    public void setNovoParticipante(Participantes novoParticipante) {
         arrayParticipantes.add(novoParticipante);
    }

    public String getNome() {
        return nome;
    }   
}
