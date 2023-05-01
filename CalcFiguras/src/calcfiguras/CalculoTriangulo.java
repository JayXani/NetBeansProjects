
package calcfiguras;

public class CalculoTriangulo extends RecebimentoValores{
    public double calculoTriangulo(double base, double altura){
        setBase(base);
        setAltura(altura);
        return (getBase() * getAltura()) /2;
    }
}
