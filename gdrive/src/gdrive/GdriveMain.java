package gdrive;

import javax.swing.*;
/*
* OBS: Tive que optar em usar JOptionPane,
* devido ao "Scanner" está com problemas.
* */
public class GdriveMain {

    public static void main(String[] args) {
        Gdrive driver = new Gdrive();
        String menu = """
                \s
                1) Criar Pasta (Principal)
                2) Criar uma sub-Pasta\s
                3) Excluir uma pasta/sub-pasta\s
                4) Pesquisar uma pasta\s
                5) Verificar o tamanho de uma pasta\s
                6) Adicionar um arquivo em uma pasta/sub-pasta\s
                7) Excluir um arquivo
                8) Verificar tamanho TOTAL do DRIVER\s
                9) Sair\s""";

        boolean stop = true;
        while(stop){
           int option = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Escolha uma opção: ", JOptionPane.WARNING_MESSAGE));
            switch (option) {
                case 1 -> {
                    String nameFolder = JOptionPane.showInputDialog(null, "Escolha o nome da pasta que deseja: ");
                    JOptionPane.showMessageDialog(null, driver.createFolder(nameFolder));
                }
                case 2 -> {
                    String nameFolderMain = JOptionPane.showInputDialog(null, "Informe o nome da pasta que deseja adicionar a sub-pasta:");
                    String nameSubpastas = JOptionPane.showInputDialog(null, "Crie um nome para a sub-pasta: ");
                    JOptionPane.showMessageDialog(null, driver.addSubFolder(nameFolderMain, nameSubpastas));
                }
                case 3 -> {
                    String folderDeletedIs = JOptionPane.showInputDialog(null, "Informe o nome da pasta que deseja apagar: ");
                    JOptionPane.showMessageDialog(null, driver.deleteFolder(folderDeletedIs));
                }
                case 4 -> {
                    String searchFolder = JOptionPane.showInputDialog(null, "Informe o nome da pasta que deseja encontar: ");
                    Pasta folderIs = driver.searchFolder(searchFolder);
                    if(folderIs == null){
                        JOptionPane.showMessageDialog(null,"ERROR !\nPasta não existe !");
                        break;
                    }
                    JOptionPane.showMessageDialog(null, "Pasta encontrada: " + folderIs.getNomePasta());
                }
                case 5 -> {
                    String folderIs = JOptionPane.showInputDialog(null, "Informe o nome da pasta que deseja ver o tamanho: ");
                    double lengthIs =  driver.calculeLengthFolder(folderIs);
                    if(lengthIs <= 0) {
                        JOptionPane.showMessageDialog(null, "ERRO !\nPasta não encontrada");
                        break;
                    }
                    JOptionPane.showMessageDialog(null,"Tamanho da pasta: " + lengthIs);
                }
                case 6 -> {
                    String addFileIn = JOptionPane.showInputDialog(null, "Informe o nome da pasta onde será adicionado o arquivo: ");
                    String nameFile = JOptionPane.showInputDialog(null, "Informe o nome do arquivo que deseja: ");
                    double lenghtFile = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o TAMANHO do arquivo: "));
                    String typeFile = JOptionPane.showInputDialog(null, "Informe a extensão do arquivo, (ex: .js, .txt): ");
                    Arquivo file = new Arquivo(nameFile,typeFile, lenghtFile);
                    JOptionPane.showMessageDialog(null, driver.addFileInFolder(addFileIn, file));
                }
                case 7 -> {
                    String nameFileDelete = JOptionPane.showInputDialog(null, "Informe o nome do arquivo que deseja apagar:");
                    JOptionPane.showMessageDialog(null,driver.deleteFileInFolder(nameFileDelete));
                }
                case 8 -> {
                    double lengthOfDriver = driver.getLengthOfDriver();
                    if( lengthOfDriver <= 0 ){
                        JOptionPane.showMessageDialog(null, "Driver completamente vazio !");
                    }else{
                        JOptionPane.showMessageDialog(null, "Tamanho total: " + lengthOfDriver);
                    }
                }
                case 9 -> {
                    stop = false;
                }
            }
        }

    }
}
