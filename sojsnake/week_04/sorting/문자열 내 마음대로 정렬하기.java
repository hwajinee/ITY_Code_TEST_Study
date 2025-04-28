import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length]; //정렬 후 값 저장할 배열
        String[][] arr = new String[strings.length][2]; 
        //정렬 기준이 되는 인덱스와 같이 저장할 2차원 배열

        //1번 for문: 전체 문자열들을 돌면서, arr배열 완성하기
        for(int i=0; i<strings.length; i++){
            arr[i][0] = strings[i];
            //String.valueOf: 해당 타입 파라미터 값을 문자열로 변환
            arr[i][1] = String.valueOf(strings[i].charAt(n));
        }

        //o1배열과 o2배열을 정렬
        Arrays.sort(arr, (o1, o2) -> {
            //정렬 기준 값이 같으면, 전체를 사전순(오름차순)으로 정렬
            if(o1[1].equals(o2[1])){
                return o1[0].compareTo(o2[0]);
            }
            //같지 않으면, 정렬 기준 값으로 오름차순 정렬
            return o1[1].compareTo(o2[1]);
        });

        //2번 for문: 정렬된 arr배열의 1열 값들만 answer에 저장
        for(int i=0; i<strings.length; i++){
            answer[i] = arr[i][0];
        }
        
        return answer;
    }
}


//-------------------------------------------------------------------
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        //strings 배열에서 s1과 s2를 가져와서
        Arrays.sort(strings, (s1, s2) -> {
            //s1의 정렬 기준 값이 s2의 것과 같으면,
            if (s1.charAt(n) == s2.charAt(n)) {
                //전체 문자열을 기준으로 오름차순 정렬
                return s1.compareTo(s2);
            }
            //같지 않으면, 정렬 기준 값 n을 기준으로 오름차순 정렬
            return s1.charAt(n) - s2.charAt(n);
        });
        //sort가 끝나면 strings 배열이 정렬된 상태로 바뀌므로 그대로 리턴
        return strings;
    }
}
