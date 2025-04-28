package week03.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
    📝 문제 : [BOJ-28278] 스택2
           - switch-case문을 사용하여 입력값에 따른 실행문을 분기한다.
           - 기본적인 스택 구현

    ❗ 주의사항 :
        시간초과 발생했음 - 입출력 문제 !!!
        이유1 : System.out.println()을 사용하여, switch-case문에서 case마다 따로 출력했음.
        해결1 : 출력 횟수가 많을 땐 StringBuilder로 모아서 한 번에 출력해야 함.

        이유2 : 입력으로 Scanner클래스 사용. 느린 I/O 클래스임.
        해결2 : BufferedReader를 사용할 것 !
 */
public class BOJ_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int command = Integer.parseInt(st.nextToken());
            int value = -1;
            if(st.hasMoreTokens()) {
                value = Integer.parseInt(st.nextToken());
            }
            switch (command){
                case 1:
                    stack.add(value);
                    break;
                case 2:
                    if(!stack.isEmpty()){
                        System.out.println(stack.pop());
                    } else{
                        System.out.println(-1);
                    }
                    break;
                case 3:
                    System.out.println(stack.size());
                    break;
                case 4:
                    if(stack.isEmpty()){
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case 5:
                    if(!stack.isEmpty()){
                        System.out.println(stack.peek());
                    } else{
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}
