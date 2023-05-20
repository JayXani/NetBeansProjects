package gdrive;

import java.util.Scanner;

public class GdriveMain {

    public static void main(String[] args) {
        Gdrive drive = new Gdrive();
        Pasta newPasta;
        String menu = "1) Criar Pasta\n2) Criar um arquivo ou pesquisar conteudo de uma pasta \n3) Criar uma subPasta \n4) Excluir uma pasta \n5) Verificar o tamanho de uma pasta";
        String escolha;
        String nomePasta;
        boolean stop = true;
        Scanner teclado = new Scanner(System.in);
        Scanner selecaoDeOpcao = new Scanner(System.in);

        while (stop != false) {
            System.out.println("\nInforme a opcao que deseja: \n\n");
            System.out.println(menu);
            escolha = teclado.next();
            switch (escolha) {
                case "1":
                    System.out.println("Informe o nome da pasta que deseja: ");
                    nomePasta = selecaoDeOpcao.nextLine();
                    newPasta = new Pasta(nomePasta);
                    drive.adicionarPasta(newPasta);
 
                    break;
                    
                case "2":
                    System.out.println("Escreva o nome da pasta que deseja adicionar um arquivo (ignore os numeros iniciais)\nCaso nao exista nenhuma pasta, abaixo, que nao existem pastas no drive");
                    drive.pesquisarPasta();
                    String opcaoPasta = selecaoDeOpcao.next();
                    drive.abrirPasta(opcaoPasta);
                    break;
                case "3":
                    System.out.println("Escreva o nome da pasta que deseja adicionar uma nova pasta (ignore os numeros iniciais)\nCaso nao exista nenhuma pasta, abaixo, que nao existem pastas no drive");
                    drive.pesquisarPasta();
                    String nomePastaPesquisa = selecaoDeOpcao.next();
                    drive.adicionarSubPastas(nomePastaPesquisa);
                    break;
                case "4":
                    drive.excluirPasta();
                    break;
                case "5":
                    System.out.println("O tamanho da pasta eh: " + drive.calcTamanhoPast() + "\n(Quando a pasta estiver vazia, o tamanho dela eh 1.0)");
                    break;
            }
        }

    }

}
