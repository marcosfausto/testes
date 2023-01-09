package threads_test;

import com.google.common.collect.Lists;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Log
public class StreamParalel {

    public static void main(String[] args) {

//        System.out.println("Sequencial: ");
//        Vector<Integer> listOfNumbers = new Vector<>(Arrays.asList(1,2,3,4));
//        listOfNumbers.forEach(number ->
//                System.out.println(number + " " + Thread.currentThread().getName())
//        );
//
//
//        System.out.println("Parallel: ");
//        listOfNumbers.parallelStream().forEach(number ->
//                System.out.println(number + " " + Thread.currentThread().getName())
//        );
//
//        int sum = listOfNumbers.parallelStream().reduce(0, Integer::sum);
//        System.out.println(sum);
//
//        Produto p1 = Produto.builder().id(1).valor(1.0).build();
//        Produto p2 = Produto.builder().id(1).valor(1.0).build();
//        Produto p3 = Produto.builder().id(1).valor(1.0).build();
//        Produto p4 = Produto.builder().id(2).valor(1.0).build();
//        Produto p5 = Produto.builder().id(2).valor(1.0).build();

        List<Produto> produtoList = new ArrayList<>();

        int j = 0;
        for(int i = 0; i < 10000000;i++) {
            produtoList.add(Produto.builder().id(i).valor(i).build());
        }

        List<Integer> produtoIds = produtoList.stream().map(Produto::getId).collect(Collectors.toList());

        List<List<Integer>> partition = Lists.partition(produtoIds, 10000);

        partition.forEach(p -> {
                            System.out.println("p size: " + p.size());
                        });

        log.info("Inicio da soma...");

        Double sumProdutos = produtoList.parallelStream().reduce(0.0, (sumValor, produto) -> sumValor + produto.getValor(), Double::sum);

        log.info("sumProdutos Parallel: " + sumProdutos);

        Double sumProdutosSequencial = produtoList.stream().reduce(0.0, (sumValor, produto) -> sumValor + produto.getValor(), Double::sum);

        log.info("sumProdutos Sequencial: " + sumProdutosSequencial);


//        List<Produto> produtos = new ArrayList<>();
//
//        List<Produto> newList = Collections.synchronizedList(produtos);
//
//
//        for(int i = 1; i<10000001;i++) {
//            newList.add(Produto.builder().id(i).build());
//        }
//        AtomicLong valor = new AtomicLong(0);
//
////        final Integer[] valor = {1};
////        newList.forEach(p -> {
////           p.setValor(valor.getAndIncrement());
////       });
//
//        int result = newList.stream()
//                .reduce(0, (partialAgeResult, produto) -> partialAgeResult + produto.getValor(), Integer::sum) + 1;
//
//
//
//       // newList.parallelStream().forEach(p -> p.setValor(valor.getAndIncrement()));
//
//       log.info("" + result);

    }

}
