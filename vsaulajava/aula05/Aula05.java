
import java.util.Scanner;

public class Aula05{
    
    static Scanner teclado = new Scanner(System.in);

    private static void fatorialWhile(){
        int fat = 0;
        int contador;

        System.out.println("\nInforme um valor para a realização do fatorial: ");
        contador = Aula05.teclado.nextInt();

        fat = 1;
        while(contador > 0){

            fat *= contador;
            contador--;
        }

        System.out.println("O fatorial é: " + fat);
    }


    public static void main (String[] args){

        String menu = "\n Menu de opções"
        + "\n A)Calculo fatorial (while)"
        + "\n B)Calculo fatorial (for)"
        + "\n B)Calculo fibonnaci (while)"
        + "\n B)Calculo fibonnaci (for) \n\n ";
        String valor = null;
        
        System.out.println(menu);
        System.out.println("Digite a opção desejada: ");

        valor = Aula05.teclado.next();
        switch (valor) {
            case "A":
                fatorialWhile();
                break;
        
            default:
                break;
        }
    }
    
}