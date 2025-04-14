import java.util.*;

public class BOJ_3052_나머지 {
    public static void main(String[] args) {
        int n = 10;
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int mod = s % 42;
            set.add(mod);
        }
        System.out.println(set.size());
    }
}