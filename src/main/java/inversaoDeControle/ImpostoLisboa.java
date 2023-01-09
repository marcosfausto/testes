package inversaoDeControle;

public class ImpostoLisboa implements Imposto {
    @Override
    public double calcular(Double valor) {
        return valor * 0.15;
    }
}
