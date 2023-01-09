package inversaoDeControle;

public class CalculaImposto {

    private Imposto imposto;

    public CalculaImposto(Imposto imposto) {
        this.imposto = imposto;
    }

    public double valorTotal(double valor) {

      return valor + imposto.calcular(valor);

    }

}
