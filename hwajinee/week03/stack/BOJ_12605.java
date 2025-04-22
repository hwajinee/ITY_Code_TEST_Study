package week03.stack;

import java.util.Scanner;
import java.util.Stack;

/*
    📝 문제 : [BOJ-12605] 단어 순서 뒤집기

    💡 풀이 방법 : 공백을 기준으로 단어를 분리하고, 이를 스택에 저장한 뒤 빼내면서
                단어 순서가 반대로 출력되도록 한다.
 */
public class BOJ_12605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Stack<String> stack = new Stack<>();
        for(int i=0; i<n; i++){
            String str = sc.nextLine();
            for(String s : str.split(" ")) {
                stack.push(s);
            }
            System.out.print("Case #" + (i+1) + ": ");
            while(!stack.isEmpty()){
                System.out.print(stack.pop() + " ");
            }
            stack.clear();
            System.out.println();
        }
    }
}
