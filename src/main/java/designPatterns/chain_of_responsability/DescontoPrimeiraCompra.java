package designPatterns.chain_of_responsability;

public class DescontoPrimeiraCompra {
    public static Double descontoPrimeiraCompra(Integer quantidade, boolean primeiraCompra,Double valor) {
        return primeiraCompra ? valor - (valor * 0.10) : DescontoItens.descontoItens(quantidade,valor);
    }
}
