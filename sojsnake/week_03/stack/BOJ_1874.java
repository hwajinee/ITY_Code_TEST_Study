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

        int nextNum = 1; //스택에 들어갈 수(1부터 n까지 증가시키면서 출력해야 할 값 찾기)
        for(int i=0; i<n; i++){
            int num = sc.nextInt();

            //출력해야 할 값보다 현재 값이 작거나 같으면,
            while(nextNum <= num){
                //스택에 현재 값 넣고, 1 증가
                stack.push(nextNum);
                list.add('+');
                nextNum++;
            }
            //맨 위의 수와 출력해야 할 값 비교. 같으면 뽑기
            if(stack.peek() == num) {
                stack.pop();
                list.add('-');
            }
            //같지 않으면, 연산 불가능한 경우
            else{
                System.out.println("NO");
                return;
            }
        }
        for(char c : list){
            System.out.println(c);
        }
    }
}
