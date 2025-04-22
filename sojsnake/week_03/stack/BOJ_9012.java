//한 곳에서 입력과 출력 이루어짐 -> stack

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //string builder에 결과값 전체 넣어두고 한 번에 출력할 것
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        //입력 데이터의 수 동안 돌면서
        for(int i=0; i<n; i++){
            //각 데이터별 스택 만들기
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            //VPS인지 판단할 boolean값
            boolean isVPS = true;

            //한 줄씩 돌면서
            for(char c : input.toCharArray()){
                //왼쪽 괄호가 들어오면 스택에 푸시
                if(c == '(') {
                    stack.push(c);
                }
                //오른쪽 괄호가 들어오면
                else if(c == ')') {
                    //스택이 비어있지 않을 때 팝
                    if(!stack.isEmpty()) {
                        stack.pop();
                    }
                    //오른쪽 괄호가 들어왔는데 스택이 비어있으면 바로 false하고 break
                    else {
                        isVPS = false;
                        break;
                    }
                }
            }
            //for로 돌면서 짝있는 괄호 모두 팝했으므로 스택이 비어있어야 yes
            if(isVPS && stack.isEmpty()) {
                sb.append("YES\n");
            } 
            //VPS가 false이거나 스택이 비어있지 않으면 no
            else {
                sb.append("NO\n");
            }
        }
        //결과 반환
        System.out.print(sb);
    }
}
