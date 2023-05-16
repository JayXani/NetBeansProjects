package cadfestas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String option;
        boolean verify = true;
        GetDadosFesta sendDados = new GetDadosFesta();
        while (verify) {
            String menu = "Bem vindo ! \n\nDigite o numero da opcao que deseje: \n"
                    + "1) Criar uma nova festa\n"
                    + "2) Descobrir seu MATCH ! hehehe\n"
                    + "3) Cadastrar novo participante\n"
                    + "4) Pesquisar Festa";

            System.out.println(menu);
            option = teclado.next();
            switch (option) {
                case "1":
                    verify = sendDados.cadastrarFesta();
                    break;
                case "2":
                    verify = sendDados.getMatch();
                    break;
                case "3":
                    verify = sendDados.cadastrarParticipante();
                    break;
                case "4":
                    verify = sendDados.searchParty();
                    break;
            }
        }
    }
}
