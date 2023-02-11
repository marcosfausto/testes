package algoritmos_test.cod_in_game;

import java.util.Arrays;

public class LetterCount {

    public static void main(String[] args) {
        System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive("william","jones","aaron", "seppe", "frank", "gilliam"));
    }

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        long count = Arrays.stream(names).filter(str -> str.length() > 5).mapToInt(String::length).sum();
        return (int) count;
    }
}
