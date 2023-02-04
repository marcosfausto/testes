package algoritmos_test;

//A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
//
//For example, array A such that:
//
//  A[0] = -3
//  A[1] = 1
//  A[2] = 2
//  A[3] = -2
//  A[4] = 5
//  A[5] = 6
//contains the following example triplets:
//
//(0, 1, 2), product is −3 * 1 * 2 = −6
//(1, 2, 4), product is 1 * 2 * 5 = 10
//(2, 4, 5), product is 2 * 5 * 6 = 60
//Your goal is to find the maximal product of any triplet.
//
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given a non-empty array A, returns the value of the maximal product of any triplet.
//
//For example, given array A such that:
//
//  A[0] = -3
//  A[1] = 1
//  A[2] = 2
//  A[3] = -2
//  A[4] = 5
//  A[5] = 6
//the function should return 60, as the product of triplet (2, 4, 5) is maximal.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [3..100,000];
//each element of array A is an integer within the range [−1,000..1,000].

import org.apache.logging.log4j.core.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxProductOfThree {

    public static void main(String[] args) {
        int[] A = {-3,1,2,-2,5,6};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
//        List<Integer> list = new ArrayList<>();
//        List<Integer> listSorted = Arrays.stream(A).sorted().boxed().collect(Collectors.toList());
//        int triplet;
//        for(int i=0;i<listSorted.size() - 2;i++) {
//            triplet = listSorted.get(i) * listSorted.get(i+1) * listSorted.get(i+2);
//            list.add(triplet);
//        }
//        return Collections.max(list);
        List<Integer> list = Arrays.stream(A).sorted().boxed().collect(Collectors.toList());
        int firstTriplet = list.get(0) * list.get(1) * list.get(2);
        int secondTriplet = list.get(list.size()-3) * list.get(list.size()-2) * list.get(list.size()-1);
        int thirdTriplet = list.get(0) * list.get(1) * list.get(list.size()-1);
        int fourthTriplet = list.get(0) * list.get(list.size()-2) * list.get(list.size()-2);

        int maxFirstTwo = Math.max(firstTriplet,secondTriplet);
        int maxThirdFourth = Math.max(thirdTriplet,fourthTriplet);
        return Math.max(maxFirstTwo,maxThirdFourth);
    }
}
