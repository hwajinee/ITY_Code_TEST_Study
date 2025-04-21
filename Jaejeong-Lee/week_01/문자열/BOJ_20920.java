package week_01.문자열;

import java.util.*;

public class BOJ_20920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> map = new HashMap<>();

        String [] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            if (word.length() < m) continue;
            arr[i] = sc.nextLine();
            if (arr[i].length() < m) break;
            for (int j=0; j < i ; j++) {
                if (arr[i].equals(arr[j])) break;
            }
        }
        for (int i = 0; i < n ; i++) {
            for (int j=0; j < arr[i].length() ; j++) {
                if(arr[i].length() < j) break;
            }

        }
    }
}
