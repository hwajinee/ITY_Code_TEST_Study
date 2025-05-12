package week_05.TwoPointers;
import java.util.*;
public class BOJ_좋다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);  // 투 포인터를 위해 정렬

        int count = 0;

        for (int i = 0; i < n; i++) {
            int target = arr[i];
            int start = 0;
            int end = n - 1;

            while (start < end) {
                // 자기 자신은 제외
                if (start == i) {
                    start++;
                    continue;
                }
                if (end == i) {
                    end--;
                    continue;
                }

                int sum = arr[start] + arr[end];

                if (sum == target) {
                    count++;
                    break;  // 한 번만 만족하면 되므로 break
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        System.out.println(count);
    }
}
