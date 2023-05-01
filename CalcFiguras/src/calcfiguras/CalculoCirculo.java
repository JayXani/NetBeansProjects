
package calcfiguras;

public class CalculoCirculo extends RecebimentoValores{
    public double calculoCirculo(double raio){
        setRaio(raio);
        return Math.PI * Math.pow(getRaio(),2);
    }
}
