package InversaoDeControle2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        PrecificacaoService precificacaoService = new PrecificacaoService(new ImpostoLisboa());
        Produto produto = new Produto("Computador", BigDecimal.valueOf(1000.0));
        System.out.println(precificacaoService.calcularPreco(produto));
    }
}
