package designPatterns.factory_method;

public class FactoryPessoa {

    public Pessoa getPessoa(String nome, String sexo){
        if(sexo.equals("M")){
            return new Homem(nome);
        } else if(sexo.equals("F")) {
            return new Mulher(nome);
        }
        throw new RuntimeException("Gender" + sexo + " does not exist!");
    }
}
