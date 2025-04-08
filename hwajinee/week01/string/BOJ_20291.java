package week01.string;

import java.util.*;

public class BOJ_20291 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // 줄바꿈 문자 제거

        Map<String, Integer> map = new TreeMap<>();
        // 확장자 추출
        for(int i=0; i<n; i++){
            String str = sc.nextLine();
            String[] strArr = str.split("\\.");
            String ext = strArr[1]; // strArr[1] : 확장자

            map.put(ext, map.getOrDefault(ext, 0) + 1); // getOrDefault() ***
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
