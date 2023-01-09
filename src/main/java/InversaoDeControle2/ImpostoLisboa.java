package InversaoDeControle2;

import inversaoDeControle.CalculaImposto;
import inversaoDeControle.Imposto;

import java.math.BigDecimal;

public class ImpostoLisboa implements CalculadoraImposto {

    @Override
    public BigDecimal calcular(Produto produto) {
        return produto.getValor().multiply(BigDecimal.valueOf(0.15));
    }
}
