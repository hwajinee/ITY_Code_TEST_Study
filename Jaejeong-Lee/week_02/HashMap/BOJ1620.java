package week_02.HashMap;

import java.util.Scanner;
import java.util.HashMap;

public class BOJ1620 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<Integer,String> reverseMap = new HashMap<>();

        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i=1; i <= n; i++){
            String name = sc.next();
            map.put(name,i);
            reverseMap.put(i,name);
        }
        for (int i=1;i<m;i++){
            //25, Raichu, 3, Pidgey, Kakuna 각각 key나 value 출력하기
            String input = sc.next();
        }
    }
}
