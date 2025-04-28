import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()]; //결과를 저장할 배열
        char[] arr = s.toCharArray(); //문자열을 char 배열로 만들기
        answer[0] = -1; //첫 문자는 무조건 -1

        //두 번째 문자부터 끝까지 돌면서
        for(int i=1; i<s.length(); i++){
            char target = arr[i];

            //문자열 처음부터 현재 타겟 문자 이전까지 돌면서 같은 문자 찾기
            for(int j=0; j<i; j++){
                //같은 문자 있으면, 거리 차이를 저장
                if(arr[i] == arr[j])
                    answer[i] = i-j;
            }
            //for문에서 같은 문자 있는 경우를 다 처리해 줬으므로, 
            //아직 값이 0인 문자는 같은 문자가 없는 경우 -> -1 넣어주기
            if(answer[i] == 0)
                answer[i] = -1;
        }
        
        return answer;
    }
}

//---------------------------------------------------------------------------------------
//Map을 사용한 풀이
import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        //target과 인덱스 정보 저장할 map
        HashMap<Character,Integer> map = new HashMap<>();

        //문자열 돌면서 타겟 문자와 일치하는 문자의 거리 구해서 map에 넣기
        for(int i=0; i<s.length();i++){
            char target = s.charAt(i);
            answer[i] = i-map.getOrDefault(target,i+1);
            //target 문자와 일치하는 문자가 있을 경우: target의 인덱스값 가져와서 i와의 거리 넣기
            //없을 경우: i+1 반환해서 answer에 i-(i+1) = -1 넣기
            //answer에 거리 정보 넣고

            //map에 (현재 문자, 인덱스) 저장하기
            //현재 문자가 저장되기 전 일치하는 문자 존재 여부를 먼저 봐야하기 때문에 put을 나중에
            map.put(target,i);
        }
        return answer;
    }
}
