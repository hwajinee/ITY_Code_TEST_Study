package week01.string;

import java.util.Scanner;

public class BOJ_11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();;
        while( !str.equals("END")){
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse());

            str = sc.nextLine();
        }
    }
}
