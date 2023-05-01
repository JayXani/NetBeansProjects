
package calcfiguras;

public class CalculoRetangulo extends RecebimentoValores {
    public double calculoRetangulo(double altura, double base){
        setBase(base);
        setAltura(altura);
        return getBase() * getAltura();
    }
}
