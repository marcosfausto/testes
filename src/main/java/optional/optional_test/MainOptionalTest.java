package optional.optional_test;

import java.util.Optional;

public class MainOptionalTest {
    public static void main(String[] args) {
        String nome = null;
    //    Optional<String> nome1 = Optional.of(nome); // NullPointerException
        Optional<String> optional = Optional.ofNullable(nome);

  //      System.out.println(optional.get()); //NoSuchElementException

        optional.ifPresent(System.out::println);

        if(!optional.isPresent()){
            System.out.println("é empty");
        }

        nome = null;

        try {
            nome = Optional.ofNullable(nome).orElseThrow(RuntimeException::new);
        } catch (RuntimeException e){
            System.out.println("nome está nulo!");
        }

        nome = Optional.ofNullable(nome).orElse("Felipe");
        String nome2 = Optional.ofNullable(nome).orElseGet(() -> "Felipe");


        System.out.println(nome);
        System.out.println(nome2);

    }
}
