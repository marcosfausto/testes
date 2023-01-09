package designPatterns.chain_of_responsability;

public class DescontoValor {
    public static Double descontoValor(Integer quantidade, boolean primeiraCompra,Double valor) {
        return valor >= 1000.0 ? valor - (valor * 0.15) : DescontoPrimeiraCompra.descontoPrimeiraCompra(quantidade,primeiraCompra,valor);
    }
}
