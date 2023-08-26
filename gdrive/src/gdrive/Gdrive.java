package gdrive;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Gdrive {
    enum Messages{
        FOLDER_CREATED,
        FOLDER_ADD_SUCCESS,
        ERROR_FOLDER_MAIN_NOT_CREATED,
        ERROR_FOLDER_ALREADY_EXITS,
        ERROR_FILE_ALREADY_EXISTS_or_EMPTY,

        SUCCESS_CREATE_FILE,
        SUCCESS_DELETED,
        ERROR_NOT_DELETED,
        ERROR_FOLDER_NOT_EXISTS;
    }
    private ArrayList<Pasta> pastas = new ArrayList();

    public Messages createFolder(String nameFolder) {
        if(searchFolder(nameFolder) == null && !nameFolder.isEmpty()){
            pastas.add(new Pasta(nameFolder));
            return Messages.FOLDER_CREATED;
        }
        return Messages.ERROR_FOLDER_ALREADY_EXITS;
    }
    public Messages addFileInFolder(String nameFolder, Arquivo file){
        Pasta addFileIn = searchFolder(nameFolder);
        if(addFileIn != null){
            if(!addFileIn.getArquivo().isEmpty()){
                for(Arquivo verifyFile : addFileIn.getArquivo()){
                    if(!verifyFile.getNomeArquivo().equals(file.getNomeArquivo()) || !verifyFile.getTipoArquivo().equals(file.getTipoArquivo())){
                        addFileIn.adicionarNovosArquivos(file);
                        return Messages.SUCCESS_CREATE_FILE;
                    }
                }
            }
            addFileIn.adicionarNovosArquivos(file);
            return Messages.SUCCESS_CREATE_FILE;
        }
        return Messages.ERROR_FILE_ALREADY_EXISTS_or_EMPTY;
    }
    public Messages deleteFileInFolder(String nameFileToDelete){
        for(Pasta folderMain : pastas){
            for (Arquivo files : folderMain.getArquivo()){
                if(files.getNomeArquivo().equals(nameFileToDelete)){
                    folderMain.getArquivo().remove(files);
                    return Messages.SUCCESS_DELETED;
                }
            }
            if(deleteFileRecursive(folderMain, nameFileToDelete)) return Messages.SUCCESS_DELETED;
        }
        return Messages.ERROR_NOT_DELETED;
    }
    private boolean deleteFileRecursive(Pasta subFolder, String nameFile){
        for(Pasta folder : subFolder.getSubPasta()){
            for(Arquivo file : folder.getArquivo()){
                if(file.getNomeArquivo().equals(nameFile)){
                    folder.getArquivo().remove(file);
                    return true;
                }
            }
            if(!subFolder.getSubPasta().isEmpty()) return deleteFileRecursive(folder, nameFile);
        }
        return false;
    }
    public Messages addSubFolder(String nameFolderMain, String nameSubpasta) {
        Pasta addIn = searchFolder(nameFolderMain);
        if(addIn != null){
            addIn.adicionarSubpastas(new Pasta(nameSubpasta));
            return Messages.FOLDER_ADD_SUCCESS;
        }
        return Messages.ERROR_FOLDER_MAIN_NOT_CREATED;
    }

    public double calculeLengthFolder(String nameFolderIs) {
        double lengthFolder = 0;
        for(Pasta getFolder : pastas){
            if(getFolder.getNomePasta().equals(nameFolderIs)){
                lengthFolder += getFolder.getLenght();
                if(!getFolder.getArquivo().isEmpty()){
                    for(Arquivo fileInMain : getFolder.getArquivo()){
                        lengthFolder += fileInMain.getTamanhoArquivo();
                    }
                }
            }
            if(!getFolder.getSubPasta().isEmpty()){
                lengthFolder += getLengthInSubFolder(getFolder, nameFolderIs, 0); //lentgh equals at 0 because the lengthFolde contain length of getFolder;
                return lengthFolder;
            }
        }
        return lengthFolder;
    }
    private double getLengthInSubFolder(Pasta folder, String nameFolder,double length){
        for(Pasta subPasta : folder.getSubPasta()){
            if(subPasta.getNomePasta().equals(nameFolder)){
                length += subPasta.getLenght();
                if(!subPasta.getArquivo().isEmpty()) {
                    for(Arquivo file : subPasta.getArquivo()){
                        length += file.getTamanhoArquivo();
                    }
                }
            }
            if(!subPasta.getSubPasta().isEmpty()) return getLengthInSubFolder(subPasta, nameFolder, length);
        }
        return length;
    }
    private double getLengthFolder(Pasta folderIs, double length){
            for(Pasta folder : folderIs.getSubPasta()){
                length += folder.getLenght();
                if(!folder.getArquivo().isEmpty()) {
                    for (Arquivo file : folder.getArquivo()) {
                        length += file.getTamanhoArquivo();
                    }
                }
                if(!folder.getSubPasta().isEmpty()) return getLengthFolder(folder, length);
            }
        return length;
    }
    public double getLengthOfDriver(){
        double allLength = 0;
        for(Pasta folderMain : pastas){
            allLength += folderMain.getLenght();
            for(Arquivo fileInMain : folderMain.getArquivo()){
                allLength += fileInMain.getTamanhoArquivo();
            }
            if(!folderMain.getSubPasta().isEmpty()){
                allLength += getLengthFolder(folderMain, 0);
                //length equals 0 because "allLength" contain the lentgh of "folderMain"
            }
        }
        return allLength;
    }

    public Messages deleteFolder(String nameFolder) {
        for(Pasta folderDelete : pastas){
            if(folderDelete.getNomePasta().equals(nameFolder)){
                pastas.remove(folderDelete);
                return Messages.SUCCESS_DELETED;
            }
            boolean success = deleteInRecursive(folderDelete, nameFolder);
            if(success) return Messages.SUCCESS_DELETED;
        }
        return Messages.ERROR_NOT_DELETED;
    }
    private boolean deleteInRecursive(Pasta folderIs, String folderDeleteIs){
        for(Pasta subPastas : folderIs.getSubPasta()){
            if(subPastas.getNomePasta().equals(folderDeleteIs)){
                folderIs.getSubPasta().remove(subPastas);
                return true;
            }
            boolean verifyOuther = deleteInRecursive(subPastas, folderDeleteIs);
            if(verifyOuther) return true;
        }
        return false;
    }
    public Pasta searchFolder(String nameFolder) {
        for (Pasta folder : pastas) {
            if (folder.getNomePasta().equals(nameFolder)) {
                return folder;
            }
            Pasta getFolder = searchRecursive(folder, nameFolder);
            if (getFolder != null) {
                return getFolder;
            }
        }
        return null;
    }

    private Pasta searchRecursive(Pasta folderActual, String nameFolder) {
        for (Pasta subPastas : folderActual.getSubPasta()) {
            if (subPastas.getNomePasta().equals(nameFolder))return subPastas;
            Pasta found = searchRecursive(subPastas, nameFolder);
            if(found != null) return found;
        }
        return null;
    }

}
