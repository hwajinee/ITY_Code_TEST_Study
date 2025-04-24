package week_01.배열;
import java.util.*;
public class BOJ_바구니뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        //교환 횟수 입력
        int M = sc.nextInt();
        int index[] = new int[N];

        for (int i = 0; i < index.length; i++) {
            index[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            int j = sc.nextInt()-1;
            int k = sc.nextInt()-1;

            while(j<k)
            {
                int temp = index[j];
                index[j]=index[k];
                index[k] = temp;
                j++;
                k--;
            }
        }

        // 출력
        for (int num : index) {
            System.out.print(num + " ");
        }
    }
}
