import java.util.*;
import java.io.*;

public class BOJ_28278_스택2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 출력 버퍼

        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] cmd = br.readLine().split(" ");
            switch (Integer.parseInt(cmd[0])) {
                case 1 :
                    int x = Integer.parseInt(cmd[1]);
                    stack.push(x);
                    break;
                case 2 :
                    if(stack.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case 3 :
                    sb.append(stack.size()).append("\n");
                    break;
                case 4 :
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 5 :
                    if (stack.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }

        // 최종 출력
        System.out.print(sb.toString());
    }
}
