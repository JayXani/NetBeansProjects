package calcfiguras;

public class CalcFiguras {
    public static void main(String[] args) {
        CalculoTriangulo ct = new CalculoTriangulo();
        CalculoRetangulo rt = new CalculoRetangulo();
        CalculoCirculo cc = new CalculoCirculo();
        System.out.println("O calculo do triangulo eh: "+ct.calculoTriangulo(2, 5));
        System.out.println("O calculo do retangulo eh: "+rt.calculoRetangulo(2, 5));
        System.out.println("O calculo do Circulo eh:"+ cc.calculoCirculo(5));
        
    }   
}
