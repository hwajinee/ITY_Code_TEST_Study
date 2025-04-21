package week_03.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BOJ12605 {
    public static void main(String[] args) {
        // BOJ 12605 단어순서 뒤집기

        // 띄어쓰기를 기준으로 단어 덩어리를 하나의 요소로 인식
        // 공백 인식 안 하니까
        // input 을 띄어쓰기를 기준으로 나눔.
        // => split()
        // stack에 넣기
        // stack에 후입선출로 출력

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= num; i++) {
            String sent = sc.nextLine();
            String[] words = sent.split("\\s+");
            // 정규표현식
            // "\\s+" 사용 : 하나 이상의 공백 문자들을(스페이스,탭 등)을 하나로 취급해서 split하게 됨.
            // 탭 문자, 여러 공백 등도 모두 정리 가능.
            // \s : 공백 의미
            // \s+ : 하나 이상의 공백 문자 의미
            // .split(" ") -> 정확히 1개의 스페이스로만 분리


            // for문 안에서 stack 한번 쓰고 다음 문장 시 초기화되도록 함.
            Stack<String> stacked = new Stack<>();
            for (String word : words) {
                stacked.push(word);
            }

            System.out.print("Case #" + i + ":");
            while (!stacked.isEmpty()){
                System.out.print(" " + stacked.pop());
            }
            System.out.println();
        }
    }
}