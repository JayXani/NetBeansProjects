package gdrive;

import java.util.ArrayList;
import java.util.Scanner;

public class Gdrive {

    Scanner teclado = new Scanner(System.in);
    ArrayList<Pasta> novaPasta = new ArrayList();

    public void adicionarPasta(Pasta adicionarPasta) {
        novaPasta.add(adicionarPasta);
    }

    public void adicionarSubPastas(String nomePasta) {
        if (novaPasta.isEmpty()) {
            System.out.println("\nDeve-se criar uma pasta primeiro !\n");
        } else {
            for (Pasta searchPasta : novaPasta) {
                if (searchPasta.nomePasta.equals(nomePasta)) {
                    System.out.println("\nInforme o nome da pasta: \n");
                    String nomeSubPasta = teclado.next();
                    searchPasta.adicionarSubpastas(nomeSubPasta);
                    System.out.println("Pasta adicionada com sucesso");
                }
            }
        }

    }

    public double calcTamanhoPast() {
        System.out.println("\nInforme o nome da pasta que deseja verificar o tamanho:");
        String nomePastaTamanho = teclado.next();
        double tamanhoPasta = 1;
        if (novaPasta.isEmpty()) {
            System.out.println("\nDeve-se primeiro criar uma pasta !");
        } else {
            for (Pasta verifyPasta : novaPasta) {
                if (verifyPasta.nomePasta.equals(nomePastaTamanho)) {
                    if (!verifyPasta.novoArquivo.isEmpty()) {
                        for (Arquivo novoArquivo : verifyPasta.novoArquivo) {
                            tamanhoPasta += novoArquivo.tamanhoArquivo;
                        }
                    }
                    if (!verifyPasta.novaSubPasta.isEmpty()) {
                        for (SubPastas novaSubPasta : verifyPasta.novaSubPasta) {
                            if (!novaSubPasta.novoArquivo.isEmpty()) {
                                for (Arquivo getTamanhoArquivo : novaSubPasta.novoArquivo) {
                                    tamanhoPasta += getTamanhoArquivo.tamanhoArquivo;
                                }
                            }
                        }
                    }
                }
            }
        }
        return tamanhoPasta;
    }

    public void excluirPasta() {
        String menu = "\n1)Excluir Pasta \n2)Excluir uma sub-pasta";
        String escolhaExcluir;
        String escolhaPastaRemove;
        boolean stop = true;
        System.out.println("\nEscolha uma das opcoes abaixo: \n");

        while (stop != false) {
            System.out.println(menu);
            escolhaExcluir = teclado.next();
            switch (escolhaExcluir) {
                case "1":
                    if (novaPasta.isEmpty()) {
                        System.out.println("\nNao eh possivel excluir uma pasta inexistente !\n");
                        stop = false;
                    } else {
                        System.out.println("\nEscolha uma pasta para exclusao !:\n");
                        pesquisarPasta();
                        escolhaPastaRemove = teclado.next();
                        for (int i = 0; i < novaPasta.size(); i++) {
                            if (novaPasta.get(i).nomePasta.equals(escolhaPastaRemove)) {
                                System.out.println("Pasta encontrada: " + novaPasta.get(i).nomePasta);
                                System.out.println("\nDeseja excluir a pasta ? Y/N");
                                escolhaPastaRemove = teclado.next();
                                if (escolhaPastaRemove.equals("Y")) {
                                    novaPasta.remove(i);
                                    System.out.println("Pasta Excluida com sucesso\n");
                                    stop = false;
                                    break;
                                } else {
                                    System.out.println("\nPasta não excluida !\n");
                                    stop = false;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case "2":
                    if (novaPasta.isEmpty()) {
                        System.out.println("Impossuivel apagar uma pasta inexistente");
                        stop = false;
                    } else {
                        System.out.println("\nEscolha uma pasta, que deseje apagar alguma sub-pasta: \n");
                        pesquisarPasta();
                        escolhaPastaRemove = teclado.next();
                        for (Pasta principal : novaPasta) {
                            if (principal.nomePasta.equals(escolhaPastaRemove)) {
                                System.out.println("\nInforme o nome da subPasta que deseja apagar :\n");
                                escolhaPastaRemove = teclado.next();
                                for (int i = 0; i < principal.novaSubPasta.size(); i++) {
                                    if (principal.novaSubPasta.get(i).nomeSubpastas.equals(escolhaPastaRemove)) {
                                        principal.novaSubPasta.remove(i);
                                        System.out.println("\nPasta removida com sucesso !");
                                        stop = false;
                                        break;
                                    } else {
                                        System.out.println("\nPasta nao encontrada !");
                                    }
                                }
                            } else {
                                System.out.println("\nNao existe pasta com o nome informado !");
                            }
                        }
                    }
                    break;
            }
        }
        System.out.println("Escolha uma das opcoes abaixo");
    }

    public void pesquisarPasta() {
        int i = 1;
        for (Pasta searchPasta : novaPasta) {
            System.out.println(i + " " + searchPasta.nomePasta);
            i++;
        }
    }

    public void abrirPasta(String pastaAberta) {
        String escolha;
        boolean stop = true;
        String menu = "\n1)Criar um novo arquivo \n2) Ver o conteudo da pasta\n3) Adicionar arquivo em uma Sub-Pasta";

        if (novaPasta.isEmpty()) {
            System.out.println("\nNao e possivel abrir a pasta, pois ela nao existe !\n");
        } else {
            for (Pasta abrirPasta : novaPasta) {
                if (abrirPasta.nomePasta.equals(pastaAberta)) {
                    System.out.println("Pasta encontrada: " + abrirPasta.nomePasta);
                    System.out.println("\nEscolha o que deseja fazer: ");

                    while (stop != false) {
                        System.out.println(menu);
                        escolha = teclado.next();
                        switch (escolha) {

                            case "1":
                                System.out.println("\nInforme o nome do arquivo :\n");
                                String nomeArquivo = teclado.next();
                                System.out.println("\nInforme o tipo do arquivo: \n");
                                String tipoArquivo = teclado.next();
                                System.out.println("\nInforme o tamanho do arquivo: (USE ,(virgula) ao inves de . (ponto) parvalores quebrados !)\\a n");
                                double tamanho = teclado.nextFloat();
                                Arquivo novoArquivo = new Arquivo(nomeArquivo, tipoArquivo, tamanho);
                                abrirPasta.adicionarNovosArquivos(novoArquivo);
                                System.out.println("\nArquivo adicionado com sucesso\n");
                                stop = false;
                                break;
                            case "2":
                                System.out.println("\nInforme a pasta que deseja ver o conteudo: ");
                                String nomeConteudo = teclado.next();
                                if (abrirPasta.nomePasta.equals(nomeConteudo)) {
                                    System.out.println("\nPasta: " + abrirPasta.nomePasta);
                                    if (abrirPasta.novoArquivo.isEmpty()) {
                                        System.out.println("\nNao Existe arquivos dentro da pasta: " + abrirPasta.nomePasta);
                                    } else {
                                        for (Arquivo arquivoPasta : abrirPasta.novoArquivo) {
                                            System.out.println(" -Arquivo da pasta: " + arquivoPasta.nomeArquivo + arquivoPasta.tipoArquivo + " Tamanho: " + arquivoPasta.tamanhoArquivo);
                                        }
                                    }
                                    if (abrirPasta.novaSubPasta.isEmpty()) {
                                        System.out.println("Não existem Sub-Pastas");
                                    } else {

                                        for (SubPastas subEncontrada : abrirPasta.novaSubPasta) {
                                            System.out.println(subEncontrada.nomeSubpastas);
                                            if (subEncontrada.novoArquivo.isEmpty()) {
                                                System.out.println("\nNao existem arquivos dentro da sub-pasta\n" + subEncontrada.nomeSubpastas);
                                            } else {
                                                for (Arquivo encontrado : subEncontrada.novoArquivo) {
                                                    System.out.println("  --Arquivo da sub-pasta: " + encontrado.nomeArquivo + encontrado.tipoArquivo + " Tamanho : " + encontrado.tamanhoArquivo);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    System.out.println("Não existe pasta com o nome informado");
                                }
                                stop = false;
                                break;
                            case "3":
                                System.out.println("\nInforme o nome da sub-pasta que deseja : \n");
                                String subPasta = teclado.next();
                                if (abrirPasta.novaSubPasta.isEmpty()) {
                                    System.out.println("\nCrie uma sub-pasta primeiramente !\n");
                                } else {
                                    for (SubPastas criacaoArquivoSub : abrirPasta.novaSubPasta) {
                                        if (criacaoArquivoSub.nomeSubpastas.equals(subPasta)) {
                                            System.out.println("\nInforme o nome do arquivo que deseja criar: \n");
                                            String nameNewArquivo = teclado.next();
                                            System.out.println("\nInforme o tipo de arquivo, ex: .txt, .rar\n");
                                            String tipoDeArquivo = teclado.next();
                                            System.out.println("\nInforme o tamanho do arquivo (USE ,(virgula) ao inves de . (ponto) parvalores quebrados !)\n");
                                            double tamanhoArquivo = teclado.nextFloat();
                                            Arquivo newArquivo = new Arquivo(nameNewArquivo, tipoDeArquivo, tamanhoArquivo);
                                            criacaoArquivoSub.novoArquivo.add(newArquivo);
                                            System.out.println("\nArquivo criado com sucesso !\n");
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }
            }
        }
    }

}
