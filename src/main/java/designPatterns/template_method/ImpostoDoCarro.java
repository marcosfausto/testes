package designPatterns.template_method;

public class ImpostoDoCarro implements Impostos{
    @Override
    public Double calcula(Double valor) {
        return valor - 150;
    }
}
