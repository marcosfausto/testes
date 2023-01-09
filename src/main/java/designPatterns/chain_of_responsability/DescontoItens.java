package designPatterns.chain_of_responsability;

public class DescontoItens {
    public static Double descontoItens(Integer quantidade,Double valor) {
        return quantidade > 2 ? valor - (valor * 0.05) : valor;
    }
}
