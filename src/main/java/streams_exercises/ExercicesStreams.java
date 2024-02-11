package streams_exercises;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExercicesStreams {

    public static void main(String[] args) {
        List<String> listExercise1 = Arrays.asList("Ana", "Bruno", "Carlos", "Ana Clara");
        System.out.println(filterLetterA(listExercise1));

        List<Integer> listExercise2 = Arrays.asList(1, 6, 5, 7, 9, 12, 13);
        System.out.println(findFirstEven(listExercise2));

        List<Double> listExercise3 = Arrays.asList(1.5, 2.7, 3.9, 4.1, 5.3);
        System.out.println(calculateAverage(listExercise3));

        List<Integer> listExercise4 = Arrays.asList(5, 8, 12, 15, 2, 7, 11);
        System.out.println(countHowManyNumbersAreBiggerThan10(listExercise4));

        List<Integer> listExercise5 = Arrays.asList(5, 8, 12, 15, 2, 7, 11);
        System.out.println(countHowManyNumbersAreBiggerThan10(listExercise5));

        List<String> listExercise6 = Arrays.asList("Olá", " ", "mundo", "!");
        System.out.println(concatAllStringInASingleOne(listExercise6));

        List<Integer> listExercise7 = Arrays.asList(1, 5, 8, 10, 2, 7, 9);
        System.out.println(findMaximumElement(listExercise7));

        List<Integer> listExercise8 = Arrays.asList(5, 4, 8, 1, 2, 7, 9);
        System.out.println(findMinimumElement(listExercise8));

        List<Pessoa> listExercise9 = Arrays.asList(
            new Pessoa("Bruno", 25),
            new Pessoa("Ana", 20),
            new Pessoa("Carlos", 30),
            new Pessoa("Ana Clara", 22));
        System.out.println(mapByNamePriority(listExercise9));

        System.out.println(listByNamePriority(listExercise9));

    }

//  10 Exercícios em Java de Streams

//  1. Filtrar uma lista de strings para obter apenas as que começam com a letra "A":
//    List<String> strings = Arrays.asList("Ana", "Bruno", "Carlos", "Ana Clara");
    private static List<String> filterLetterA(List<String> list) {
        return list.stream().filter(a -> a.toLowerCase().startsWith("a")).collect(Collectors.toList());
    }

//  2. Encontrar o primeiro número par em uma lista de números:
//  List<Integer> numeros = Arrays.asList(1, 3, 5, 7, 9, 11, 13);
    private static Integer findFirstEven(List<Integer> list) {
        return list.stream().filter(n -> n % 2 == 0).findFirst().orElse(null);
    }

//  3. Calcular a média dos números em uma lista:
//    List<Double> numeros = Arrays.asList(1.5, 2.7, 3.9, 4.1, 5.3);
    private static Double calculateAverage(List<Double> list) {
        return list.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

//  5. Contar quantos números em uma lista são maiores que 10:
//    List<Integer> numeros = Arrays.asList(5, 8, 12, 15, 2, 7, 11);
    private static Long countHowManyNumbersAreBiggerThan10(List<Integer> list) {
        return list.stream().filter(n -> n > 10).count();
    }

//  6. Concatenar todas as strings em uma lista em uma única string:
//    List<String> strings = Arrays.asList("Olá", " ", "mundo", "!");
    private static String concatAllStringInASingleOne(List<String> list) {
       // return list.stream().collect(Collectors.joining());
        return String.join("", list);
       // return list.stream().reduce(String::concat).orElse("");
    }

//  7.Encontrar o elemento máximo em uma lista:
//    List<Integer> numeros = Arrays.asList(1, 5, 8, 3, 2, 7, 9);
    private static Integer findMaximumElement(List<Integer> list) {
        return list.stream().max(Integer::compareTo).orElse(null);
    }

//  8. Encontrar o elemento mínimo em uma lista:
//  List<Integer> numeros = Arrays.asList(5, 4, 8, 1, 2, 7, 9);
    private static Integer findMinimumElement(List<Integer> list) {
        return list.stream().min(Integer::compareTo).orElse(null);
    }

//    9. Agrupar os elementos de uma lista por uma propriedade ( mapa ):
//    List<Pessoa> pessoas = Arrays.asList(
//            new Pessoa("Ana", 20),
//            new Pessoa("Bruno", 25),
//            new Pessoa("Carlos", 30),
//            new Pessoa("Ana Clara", 22)
//    );
//    Map<String, List<Pessoa>> pessoasPorNome = ...;
    @Data
    @AllArgsConstructor
    static class Pessoa {
          private String nome;
          private Integer idade;
    }
    private static Map<String, List<Pessoa>> mapByNamePriority(List<Pessoa> list) {
        return list.stream().collect(Collectors.groupingBy(Pessoa::getNome));
    }

//    10. Ordenar uma lista de objetos por uma propriedade ( lista ):
//    List<Pessoa> pessoas = Arrays.asList(
//            new Pessoa("Bruno", 25),
//            new Pessoa("Ana", 20),
//            new Pessoa("Carlos", 30),
//            new Pessoa("Ana Clara", 22)
//    );
//    List<Pessoa> pessoasOrdenadasPorNome = ...;
    private static List<Pessoa> listByNamePriority(List<Pessoa> list){
        return list.stream().sorted(Comparator.comparing(Pessoa::getNome)).collect(Collectors.toList());
    }


}
