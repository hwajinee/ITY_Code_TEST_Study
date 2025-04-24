package week02;
/*
    📝 문제 : [BOJ-11478] 서로 다른 부분 문자열의 개수

    💡 풀이 방법 : 부분 문자열을 생성하여 HashSet에 저장하고, size를 구한다.

        문자열의 개수가 5라면, 길이가 1인 부분 문자열부터 길이가 5인 부분 문자열까지 순서대로 생성한다.
        이 때, 문자열의 남은 길이가 부분 문자열의 길이보다 작은 경우는 부분 문자열을 생성하지 않도록 한다.
        생성한 문자열은 중복되지 않게 저장해서 전체 갯수를 파악해야 하므로, HashSet을 사용한다.

    ❗ 주의사항 :
 */

import java.util.HashSet;
import java.util.Scanner;

public class BOJ_11478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        HashSet<String> set = new HashSet<>();  // 부분 문자열 저장

        int length = str.length();

//      (i+1) 만큼의 길이를 가진 문자열을 생성할 것.
//      string 맨앞에서부터 1칸씩 이동한 뒤, 남은 문자열의 길이가 i+1 만큼 남았는지 체크하고,
        for(int i=0; i<length; i++) { // 부분 문자열의 길이 (i+1)
            for (int j = 0; j < length; j++) { // 부분 문자열 생성할 시작점 (한 칸씩 이동)
                if (str.substring(j).length() >= i) {
                    // substring(시작 index, 끝 index) <- 시작 index만 작성할 경우, 끝 index는 자동으로 문자열의 맨끝이 된다.
                    set.add(str.substring(j, j + i));
                }
            }
        }

        System.out.println(set.size());
    }
}
