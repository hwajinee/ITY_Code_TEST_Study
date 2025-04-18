package Set;

import java.util.HashSet;
import java.util.Scanner;

public class BOJ3052 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int remainder = num % 42;
            set.add(remainder);
        }
        System.out.println(set.size());
    }
}
