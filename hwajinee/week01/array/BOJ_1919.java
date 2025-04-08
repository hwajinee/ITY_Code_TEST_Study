package week01.array;
import java.util.Scanner;

public class BOJ_1919 {
    public static void main(String[] args) {
        int[] countArr1 = new int[26];
        int[] countArr2 = new int[26];

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        for (char ch : str1.toCharArray()) {
            countArr1[ch - 'a']++;
        }

        for (char ch : str2.toCharArray()) {
            countArr2[ch - 'a']++;
        }

        int deleteCount = 0;
        for (int i = 0; i < 26; i++) {
            deleteCount += Math.abs(countArr1[i] - countArr2[i]);
        }

        System.out.println(deleteCount);
    }
}
