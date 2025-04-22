import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        List<Character> list = new ArrayList<>();

        int nextNum = 1; //스택에 들어갈 수(1부터 n까지 증가)
        for(int i=0; i<n; i++){
            int num = sc.nextInt();

            //
            while(nextNum <= num){
                stack.push(nextNum);
                list.add('+');
                nextNum++;
            }
            //맨 위의 수와 비교. 같으면 뽑기
            if(stack.peek() == num) {
                stack.pop();
                list.add('-');
            }else{
                System.out.println("NO");
                return;
            }
        }
        for(char c : list){
            System.out.println(c);
        }
    }
}
