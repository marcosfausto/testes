package designPatterns.template_method;

import designPatterns.template_method.ImpostoDaCasa;
import designPatterns.template_method.Impostos;

public class TesteImposto {

    public static void main(String[] args) {
        Impostos impostos = new ImpostoDaCasa();
        Double orçamento = 1000.0;
        System.out.println(impostos.calcula(orçamento));
    }

}
