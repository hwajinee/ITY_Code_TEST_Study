package week_04.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<int[]> points = new ArrayList<>();
        // List<List<Integer>> 로 했을 때 틀렸다고 나옴. 왜?

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new int[] {x,y});
        }
        // 좌표 끼리 비교하는 기준 직접 넣어줌.
        // ArrayList 사용 -> Collections.sort 활용
        // Collection.sort(리스트, 정렬기준(comparator) )
        Collections.sort(points, (a,b) -> {
            if (a[0]!=b[0]) {
                return a[0]-b[0]; // x 오름차순 먼저
                // return 값의 음수/0/양수 에 따라 위치 정렬
            } else {
                return a[1]-b[1]; // x 같을 때 y 오름차순 정렬
            }
        });
        for (int[] point : points) {
            System.out.println(point[0] + " " + point[1]);
        }
    }
}
