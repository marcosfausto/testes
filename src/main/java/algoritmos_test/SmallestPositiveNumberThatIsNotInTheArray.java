package algoritmos_test;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SmallestPositiveNumberThatIsNotInTheArray {
    //TODO
//     Write a function:
//     class Solution { public int solution(int[] A); }
//     that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//     For example, given org.checkerframework.checker.units.qual.A = [1, 3, 6, 4, 1, 2], the function should return 5.
//     Given A = [1, 2, 3], the function should return 4.
//     Given A = [−1, −3], the function should return 1.
//     Write an efficient algorithm for the following assumptions:
//     N is an integer within the range [1..100,000];
//     each element of array A is an integer within the range [−1,000,000..1,000,000].


    public static void main(String[] args) {

        int[] A = { 1,3, 6, 4, 2,-5,-15,20,-19};

        System.out.println(solution(A));
    }

    public static int solution(int[] A) {

        int[] smallestInt = {1};
        Arrays.stream(A).sorted().filter(x -> x == smallestInt[0]).forEach(x -> smallestInt[0]++);
        return smallestInt[0];

//        AtomicInteger smallest = new AtomicInteger(1);
//        Arrays.stream(A).sorted().filter(x -> x == smallest.get()).forEach(x -> smallest.getAndIncrement());
//        return smallest.get();

//        Arrays.sort(A);
//       int smallest = 1;
//        for (int i : A) {
//            if (i == smallest) {
//                smallest++;
//            }
//        }
//        return smallest;
    }

}
