package optional.optional_test;

import java.util.Optional;

public class MainOptionalTest {
    public static void main(String[] args) {
        String nome = null;
        Optional<String> optional = Optional.ofNullable(nome);

        System.out.println(optional.get());

        if(optional.isPresent()){
            System.out.println(optional.get());
        }

        if(!optional.isEmpty()){
            System.out.println("nao é empty");
        }

        nome = null;

        try {
            nome = Optional.ofNullable(nome).orElseThrow(RuntimeException::new);
        } catch (RuntimeException e){
            System.out.println("nome está nulo!");
        }

        nome = Optional.ofNullable(nome).orElse("Felipe");

        System.out.println(nome);
    }
}
