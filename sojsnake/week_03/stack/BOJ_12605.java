import java.util.Scanner;
import java.util.Stack;

public class BOJ_12605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            Stack<String> stack = new Stack<>();
            String[] input = sc.nextLine().split(" ");
            for(String s : input) {
                stack.push(s);
            }
            System.out.print("Case #"+(i+1)+": ");
//            pop하면 stack 사이즈가 줄어들어서 문제
//            for(int j = 0; j<stack.size(); j++){
//                System.out.print(stack.pop()+" ");
//            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }

            System.out.println();
        }
    }
}
