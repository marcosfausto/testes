package inversaoDeControle;

public class ImpostoPorto implements Imposto {
    @Override
    public double calcular(Double valor) {
        return valor * 0.1;
    }
}
