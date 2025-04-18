package week_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11365 {
    public static void main(String[] args) throws IOException {
//      개행 문자만 경계로 인식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//       한 줄에 하나의 암호가 주어지며 "END"를 만나면 끝남
        while (true) {
            String s = br.readLine();
            StringBuilder sb = new StringBuilder(s);
//          END 찾으면 break문
            if(s.equals("END")){
                break;
            }
//          reverse 사용 후, string 타입으로 변환
            String reverseStr = sb.reverse().toString();
            System.out.println(reverseStr);
        }
    }
}
