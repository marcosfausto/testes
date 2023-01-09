package inversaoDeControle;

public class Main {
    public static void main(String[] args) {
        CalculaImposto calculaImposto = new CalculaImposto(new ImpostoLisboa());

        System.out.println(calculaImposto.valorTotal(100));
    }
}
