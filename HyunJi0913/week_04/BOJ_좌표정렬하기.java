package week_04;
import java.util.*;
public class BOJ_좌표정렬하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] points = new int[n][2]; // 좌표 저장할 배열

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt(); // x
            points[i][1] = sc.nextInt(); // y
        }

        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                if (p1[0] == p2[0]) {
                    return Integer.compare(p1[1], p2[1]); // x 같으면 y 오름차순
                } else {
                    return Integer.compare(p1[0], p2[0]); // x 오름차순
                }
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(points[i][0] + " " + points[i][1]);
        }
    }
}
