package week01.string;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_1251 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        LinkedList<String> list = new LinkedList<>();
        for (int i = 2; i < str.length(); i++) {
            for (int j = 1; j < i; j++) {
                StringBuilder strSb1 = new StringBuilder(str.substring(0, j));
                StringBuilder strSb2 = new StringBuilder(str.substring(j, i));
                StringBuilder strSb3 = new StringBuilder(str.substring(i));
                String str1 = strSb1.reverse().toString();
                String str2 = strSb2.reverse().toString();
                String str3 = strSb3.reverse().toString();
                list.add(str1 + str2 + str3);
            }
        }
        Collections.sort(list);
        System.out.println(list.pop());

    }
}