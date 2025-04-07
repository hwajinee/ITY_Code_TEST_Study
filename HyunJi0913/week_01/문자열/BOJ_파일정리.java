package week_01.문자열;
import java.util.*;
public class BOJ_파일정리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        String[] index = new String[N];

        for (int i = 0; i < N; i++) {
            String filename = sc.nextLine();
            String ext = filename.substring(filename.indexOf('.') + 1);
            index[i] = ext;
        }

        Arrays.sort(index);

        // 개수 세기
        String count = index[0];
        int result = 1;

        for (int i = 1; i < N; i++) {
            if (index[i].equals(count)) {
                result++;
            } else {
                System.out.println(count + " " + result);
                count = index[i];
                result = 1;
            }
        }

        System.out.println(count + " " + result);
    }
}
