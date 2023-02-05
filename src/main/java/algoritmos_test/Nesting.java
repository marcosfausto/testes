package algoritmos_test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

//A string S consisting of N characters is called properly nested if:
//
//S is empty;
//S has the form "(U)" where U is a properly nested string;
//S has the form "VW" where V and W are properly nested strings.
//For example, string "(()(())())" is properly nested but string "())" isn't.
//
//Write a function:
//
//class Solution { public int solution(String S); }
//
//that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.
//
//For example, given S = "(()(())())", the function should return 1 and given S = "())", the function should return 0, as explained above.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [0..1,000,000];
//string S is made only of the characters "(" and/or ")".
public class Nesting {

    public static void main(String[] args) {
        System.out.println(solution("())"));
    }

    public static int solution(String S) {
        Stack<Character> stack = new Stack<>();

        for(char c: S.toCharArray()) {
            if(c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return 0;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
