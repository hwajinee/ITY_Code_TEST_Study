package week_04.seraching;

import java.util.Arrays;
import java.util.HashMap;

public class 가장가까운같은글자 {

    public static void main(String[] args) {
        int[] answer = solution("foobar");
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        // 글자 받고, 한개씩 분리
        // hashMap에 넣고, 있으면 가까운 거리 계산

        // 1. 문자열 s 분리 및 배열, hashmap에 최근 인덱스 저장
        HashMap<Character,Integer> map = new HashMap<>();

        //2. hashSet에 있을 경우, 가장 가까운 곳의 같은 글자 찾기.
        //3. for문 돌리면서 단어 나올 때마다 key에 넣기

        // array의 해당 인덱스(위치) value값은 -1로 초기화
        for (int i = 0; i < s.length(); i++) {
            Character temp = s.charAt(i);

            // 해당 알파벳이 나온 적 있는지
            if (!map.containsKey(temp)){
                map.put(temp,i);
                answer[i]=-1;

            } else {
                // 가장 가까운 곳의 같은 글자 인덱스 찾기
                // i(현재 인덱스) - 가까운 곳 글자 인덱스.
//                map.put(temp, i- map.get(temp));

                // NullpointerException 조심
                // 인덱스 배열 범위 벗어나는 exception 조심

                //한번 나온 적 있을 때
                if (map.containsKey(temp) && map.get(temp)==-1) {
                    map.put(temp,i);
                    System.out.println("answer"+ i +"일 때 " +answer[i]);

                    //나온 적 있고, 2번째 이상일 경우
                    // 최근 인덱스 빼주기
                } else if (map.containsKey(temp) && map.get(temp)!=-1){
                    System.out.println("answer"+ i +"일 때 " +answer[i]);
                    answer[i] = i - map.get(temp);
                }
                // 가장 최근 등장한 인덱스 업데이트 해주기
                //banana
                map.put(temp, i);
            }
        }
        return answer;
    }
}