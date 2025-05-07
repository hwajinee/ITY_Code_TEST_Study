package week_05.twoPointers;

//import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4158 {
    public static void main(String[] args) throws IOException {
        // scanner 사용 시 시간 초과됨. -> bufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n==0 && m==0) break;

            // 문제에 여러 개의 테스트 케이스로
            // 이루어져 있다고 했으므로 while문 사용해서
            // 0 0 입력 마지막값 받아야 함.

            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                arr1[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                arr2[i] = Integer.parseInt(st.nextToken());
            }

            // 확인용
//            System.out.println("arr1 : "+Arrays.toString(arr1));
//            System.out.println("arr2 : "+Arrays.toString(arr2));

            // 순서대로 정렬 되어 있으니
            // arr1에 포인터 하나 두고, arr2에 다른 포인터 두기
            // 비교하면서 같은 거 있으면 count++ 하고
            // arr1 포인터 이동
            // 다시 arr2의 i번째 인덱스부터 요소 비교

            int idx1 = 0;
            int idx2 = 0;
            int count = 0;

            while (idx1<n && idx2 <m) {
                if (arr1[idx1] == arr2[idx2]) {
                    count++;
                    idx1++;
                    idx2++;
                } else {
                    if (arr1[idx1] < arr2[idx2]) {
                        idx1++;
                    } else {
                        idx2++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}