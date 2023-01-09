package InversaoDeControle2;

import inversaoDeControle.Imposto;

import java.math.BigDecimal;

public class ImpostoPorto implements CalculadoraImposto {

    @Override
    public BigDecimal calcular(Produto produto) {
        return produto.getValor().multiply(BigDecimal.valueOf(0.10));
    }
}
