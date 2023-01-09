package designPatterns.template_method;

public class ImpostoDaCasa implements Impostos{
    @Override
    public Double calcula(Double valor) {
        return valor - 50;
    }
}
