package week02.HashMap;
/*
    📝 문제 : [BOJ-1302] 베스트셀러 / 실버 4

    🛠️ 풀이 방법 : HashMap - key(책 제목), value(팔린 갯수)
       책 제목을 key로 하고, 팔린 갯수를 value로 하는 HashMap 생성.
       책 제목의 중복 여부를 고려하며 팔린 갯수를 count한다.

    💡 추가로 공부한 내용 :
       - get(Object key) vs getOrDefault(Object key, Integer defaultValue)
        두 메서드 모두 key을 기준으로 탐색하여, 해당하는 value값을 반환한다.
        HashMap의 탐색은 시간복잡도 O(1)으로 매우 강력하다 !
        * 차이점은 Key가 없을 때 반환하는 값의 차이이다.
          get() : null 값 반환
          getOrDefault() : 매개변수로 지정한 defaultValue 값 반환

    ❗ 주의사항 :
        - compareTo() 
        if( BestSeller.compareTo(title) == 1){
                    BestSeller = title;
                    num = map.get(title);
                }
        }

*/

import java.util.HashMap;
import java.util.Scanner;

public class BOJ_1302 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String title = sc.nextLine();
            if(map.containsKey(title)){
                map.put(title, map.get(title) + 1);
            } else {
                map.put(title, 1);
            }
        }

        String BestSeller = "";
        int num = 0;
        for(String title : map.keySet()){
            if(map.get(title) > num){
                BestSeller = title;
                num = map.get(title);
            } else if(map.get(title) == num){
                if( BestSeller.compareTo(title) > 0){
                    BestSeller = title;
                    num = map.get(title);
                }
            }
        }

        System.out.println(BestSeller);

    }
}
