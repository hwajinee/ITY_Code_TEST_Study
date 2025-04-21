package study2025;

import java.util.Scanner;

public class BOJ_10988 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        StringBuilder sb = new StringBuilder(word);

        sb.reverse();
//        <내 풀이>
//        if ( word.equals(sb.toString())) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }

        int ans = word.equals(sb.toString()) ? 1 : 0;
        System.out.println(ans);
    }
}
