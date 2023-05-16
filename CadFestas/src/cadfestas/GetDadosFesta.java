package cadfestas;

import java.util.ArrayList;
import java.util.Scanner;

public class GetDadosFesta {

    private final ArrayList<Festas> novaFesta = new ArrayList();
    private final ArrayList<String> perguntas = new ArrayList();
    private final ArrayList<String> respostas = new ArrayList();
    private Participantes novoParticipante;
    Festas dadosFesta;
    Scanner teclado = new Scanner(System.in);

    public boolean cadastrarFesta() {
        System.out.println("Informe o nome da festa: ");
        String nameParty = teclado.next();

        System.out.println("\nInforme uma descricao sobre a festa: ");
        String describe = teclado.next();

        dadosFesta = new Festas(nameParty, describe);
        novaFesta.add(dadosFesta);

        System.out.println("\nFesta Cadastrada com sucesso !\nPara adicionar participantes, retorne para o menu e escolha a opcao 4");
        return true;
    }

    public boolean cadastrarParticipante() {
        String nomeParty;
        String verifyOption;
        String getPerguntas;
        String getRespostas;
        String nameParticipante;
        String optionStop = "Y";
        Scanner teclado2 = new Scanner(System.in);
       
        System.out.println("Informe o nome da festa para busca: ");
        nomeParty = teclado2.next();

        for (Festas festaRecuperada : novaFesta) {
            if (festaRecuperada.getNome().equals(nomeParty)) {
                System.out.println("Festa encontrada : " + festaRecuperada.getNome());
                System.out.println("\nDeseja cadastrar um novo participante ? Y/N");
                verifyOption = teclado2.next();

                if (verifyOption.toUpperCase().equals("Y")) {
                    
                    festaRecuperada.getNovoParticipante();
                    System.out.println("Informe qual o nome do participante: ");
                    nameParticipante = teclado2.next();

                    System.out.println("\nColoque abaixo as perguntas e respostas de cada participante: \nQuando desejar parar, digite \"N/Y\"");

                    while (optionStop.toUpperCase().equals("Y")) {
                        System.out.println("Deseja adicionar mais perguntas? \n");
                        optionStop = teclado2.next();
                        String ifOptionsStop = (optionStop.toUpperCase().equals("N") ? "N" : "Y");

                        if (ifOptionsStop.toUpperCase().equals("Y")) {

                            System.out.println("Pergunta: ");
                            getPerguntas = teclado.next();
                            perguntas.add(getPerguntas);
                            
                            System.out.println("Resposta: ");
                            getRespostas = teclado.next();
                            respostas.add(getRespostas);
                        } else {
                            novoParticipante = new Participantes(nameParticipante, perguntas, respostas);
                            dadosFesta.setNovoParticipante(novoParticipante);
                        }
                    }
                } else {
                    return true;
                }

            } else {
                System.out.println("Sentimos muito, mas não foi possivel encontrar a festa ! :(");
            }
        }
        return true;
    }

    public boolean getMatch() {
        ArrayList<Participantes> verificadorDeMatch;
        ArrayList<Participantes> perguntas = dadosFesta.getNovoParticipante();
        ArrayList<Participantes> respostas;
        verificadorDeMatch = dadosFesta.getNovoParticipante();
        Participantes match1;
        int perguntasIguais = 0;
        
        for (int i = 1; i < verificadorDeMatch.size(); i++) {
            match1 = dadosFesta.getNovoParticipante().get(i - 1);
            if (match1.getPerguntas().equals(verificadorDeMatch.get(i).getPerguntas())) {
                if (match1.getRespostas().equals(verificadorDeMatch.get(i).getRespostas())) {
                    
            
                    perguntasIguais += 1;
                    System.out.println("O match do:" + match1.getNome() + " EH o " + verificadorDeMatch.get(i).getNome() + " Com" + perguntasIguais + "respostas iguais");
                    
                } else {
                    System.out.println("Nenhum match encontrado !");
                }
            } else {
                System.out.println("Perguntas diferentes");
            }
        }
        return true;
    }
    public boolean searchParty(){
        int i = 1;
        for(Festas partyRecuperada : novaFesta){
            System.out.println(i + "Festa recuperada: " + partyRecuperada.getNome());
            i++;
        }
        return true;
    }
    
}
