package algoritmos_test;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
    //TODO
//    A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
//
//    For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
//
//    Write a function:
//
//    class Solution { public int solution(int N); }
//
//    that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
//
//    For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
//
//    Write an efficient algorithm for the following assumptions:
//
//    N is an integer within the range [1..2,147,483,647].

    public static void main(String[] args) {


        System.out.println(solution(529));

    }

    public static int solution(int N){

//        String binaryString = Integer.toBinaryString(N);
//
//        int longestBinaryGap = 0;
//        List<Integer> onesList = new ArrayList<>();
//
//        for(int i=0; i<binaryString.length(); i++) {
//            if(binaryString.charAt(i) == '1') {
//                onesList.add(i);
//            }
//        }
//
//        for(int i=0; i<onesList.size() - 1; i++) {
//            //subtract 1 so that don't count 1's next to each other as having any gap
//            int indicesDiff = onesList.get(i+1) - onesList.get(i) - 1;
//
//            longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
//        }
//        return longestBinaryGap;


        String binary = Integer.toBinaryString(N);

        System.out.println(binary);

        char[] array = binary.toCharArray();

        int countOne = 0;
        int countZero = 0;
        int finalZeroCounter = 0;
        for(char y: array) {
           if(Integer.parseInt(String.valueOf(y)) == 1){
               countOne++;
           }
           if(countOne > 1) {
               finalZeroCounter = Math.max(finalZeroCounter, countZero);
               countZero = 0;
               countOne = 1;
           }
            if(Integer.parseInt(String.valueOf(y)) == 0){
                countZero++;
            }
        }

        return finalZeroCounter;

    }

}
