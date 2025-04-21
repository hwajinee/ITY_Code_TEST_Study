import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            boolean isVPS = true;

            for(char c : input.toCharArray()){
                if(c == '(') {
                    stack.push(c);
                }
                else if(c == ')') {
                    if(!stack.isEmpty()) {
                        stack.pop();
                    }
                    else {
                        isVPS = false;
                        break;
                    }
                }
            }
            if(isVPS && stack.isEmpty()) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}