package week03.stack;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Stack<Character> stack = new Stack<>();

        while(n > 0){
            boolean isValid = true;
            char[] charArr = sc.nextLine().toCharArray();

            for(char ch : charArr) {
                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if(!stack.isEmpty()){
                        stack.pop();
                    } else {
                        isValid = false;
                    }
                }
            }

            if (isValid && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            stack.clear();
            n--;
        }
    }
}

