package week_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2798 {
//    BOJ_blackJack
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // N과 M 입력 받기
        String inputNM = br.readLine();
        int N = Integer.parseInt(inputNM.split(" ")[0]);
        int M = Integer.parseInt(inputNM.split(" ")[1]);

        // N만큼 배열에 넣기
        int[] cards = new int[N];
        st = new StringTokenizer(br.readLine());
        int i = 0;
        while (st.hasMoreTokens()) {
            cards[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        // 합 구하기
        int sum = 0;
        int result = 0;
        for (i = 0; i < N-2; i++){
            if (cards[i] > M) { continue; }

            for (int j = i+1; j < N-1; j++){
                if (cards[i] + cards[j] > M) { continue; }
                for (int k = j+1; k < N; k++){
                    sum = cards[i] + cards[j] + cards[k];

                    if (M == sum) {
                        result = sum;
                    }
                    if (result < sum && sum <= M){
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
