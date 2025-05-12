package week06.PSG_피보나치_수;
/*
    Q. n값이 커지면, arr 배열에 저장할 때 오버플로우가 발생하는 것은 이해함.
       그런데, 피보나치 수는 이전 값을 알아야 다음 값을 구할 수 있는건데,
       arr배열에 저장할 때, 1234567로 나눈 값을 저장해도 되는가 ?

    A. 당근.
       (a%5) + (b%5) == (a + b)%5 !!!
       어차피 나머지를 구하는 문제이므로, 먼저 나누고 저장해도 문제 없음.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i=2; i<=n; i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
            // int 배열에 값을 저장할 때, 1234567로 나눠주지 않으면 n이 클 때 오버플로우 발생함.
        }

        System.out.println(arr[n]);
    }
}
