package week06.PSG_피보나치_수;
// 재귀 X -> for문 사용해서 풀어야 함.
// 그래서 풀었는데, 시간초과 . . . ㄸㄹㄹ 답은 뭘까
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int a = 0;
        int b = 1;

        for(int i=2; i<=n; i++){
            int temp = a+b;
            a = b;
            b = temp;
        }

        System.out.println(b);
    }
}
