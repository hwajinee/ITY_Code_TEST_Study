import java.util.*;
import java.io.*;

public class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        HashSet<Integer> sumSet = new HashSet<>();

        for (int length = 1; length <= n; length++) {
            int sum = 0;


            for (int i = 0; i < length; i++) {
                sum += elements[i];
            }
            sumSet.add(sum);

            // 슬라이딩 윈도우 이동
            for (int i = 1; i < n; i++) {
                sum -= elements[(i - 1) % n];
                sum += elements[(i + length - 1) % n];
                sumSet.add(sum);
            }
        }

        return sumSet.size();
    }
}
