package InversaoDeControle2;

import java.math.BigDecimal;

public class PrecificacaoService {

    private CalculadoraImposto calculadoraImposto;

    public PrecificacaoService(CalculadoraImposto calculadoraImposto) {
        this.calculadoraImposto = calculadoraImposto;
    }

    public BigDecimal calcularPreco(Produto produto) {
        // faz outros cálculos de preço
        return this.calculadoraImposto.calcular(produto);
    }


}
