package algoritmos_test.codility;

public class MinAvgTwoSlice {

//    A non-empty array A consisting of N integers is given. A pair of integers (P, Q), such that 0 ≤ P < Q < N, is called a slice of array A (notice that the slice contains at least two elements). The average of a slice (P, Q) is the sum of A[P] + A[P + 1] + ... + A[Q] divided by the length of the slice. To be precise, the average equals (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).
//
//    For example, array A such that:
//
//    A[0] = 4
//    A[1] = 2
//    A[2] = 2
//    A[3] = 5
//    A[4] = 1
//    A[5] = 5
//    A[6] = 8
//    contains the following example slices:
//
//    slice (1, 2), whose average is (2 + 2) / 2 = 2;
//    slice (3, 4), whose average is (5 + 1) / 2 = 3;
//    slice (1, 4), whose average is (2 + 2 + 5 + 1) / 4 = 2.5.
//    The goal is to find the starting position of a slice whose average is minimal.
//
//    Write a function:
//
//    class Solution { public int solution(int[] A); }
//
//    that, given a non-empty array A consisting of N integers, returns the starting position of the slice with the minimal average. If there is more than one slice with a minimal average, you should return the smallest starting position of such a slice.
//
//    For example, given array A such that:
//
//    A[0] = 4
//    A[1] = 2
//    A[2] = 2
//    A[3] = 5
//    A[4] = 1
//    A[5] = 5
//    A[6] = 8
//    the function should return 1, as explained above.
//
//    Write an efficient algorithm for the following assumptions:
//
//    N is an integer within the range [2..100,000];
//    each element of array A is an integer within the range [−10,000..10,000].

    public static void main(String[] args) {

    }

    public int solution(int[] A) {

        //main idea: will find min average by checking only 2 and 3 contiguous elements at a time
        int sum1, sum2 = 0;
        double minAverage = Double.MAX_VALUE;
        double currentAverage1 = Double.MAX_VALUE;
        double currentAverage2 = Double.MAX_VALUE;
        int minAverageSliceIndex = 0; //for size 2 arrays, this will always be true

        //if array is > 2 elements
        for(int i=0; i<A.length-2; i++) {
            sum1 = A[i] + A[i+1];
            currentAverage1 = sum1 / 2.0d;
            if(currentAverage1 < minAverage) {
                minAverage = currentAverage1;
                minAverageSliceIndex = i;
            }

            sum2 = sum1 + A[i+2];
            currentAverage2 = sum2 / 3.0d;
            if(currentAverage2 < minAverage) {
                minAverage = currentAverage2;
                minAverageSliceIndex = i;
            }
        }

        //check last 2 contiguous elements from the end - they won't otherwise be checked because
        //when checking 2 and 3 contiguous elements at a time, will stop checking 3 elements from the end
        currentAverage1 = (A[A.length-2] + A[A.length-1]) / 2.0d;
        if(currentAverage1 < minAverage) {
            minAverage = currentAverage1;
            minAverageSliceIndex = A.length-2;
        }

        return minAverageSliceIndex;
    }
}
