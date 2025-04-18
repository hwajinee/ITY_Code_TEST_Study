import java.util.*;
import java.lang.*;
import java.io.*;

class BOJ_1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        // map에서 key에 해당하는 value는 가져오는 get은 있지만 반대의 경우는 없음.
        // (숫자, 이름), (이름, 숫자)로 map 2개 만들기
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        HashMap<String, Integer> map2 = new HashMap <String, Integer>();

        // 1번 for문: 입력받아서 map 2개 완성
        for(int i=0; i<n; i++){
            String name = sc.nextLine();
            map1.put(i+1, name);
            map2.put(name, i+1);
        }

        // 2번 for문: 문제 입력받고, 첫 문자로 문제가 숫자인지 여부 판별
        for(int i=0; i<m; i++){
            String question = sc.nextLine();
            if(Character.isDigit(question.charAt(0))){
                int num = Integer.parseInt(question);
                System.out.println(map1.get(num));
            }
            else{
                System.out.println(map2.get(question));
            }
        }
    }
}
