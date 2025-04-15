import java.util.Scanner;

public class BOJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        // 대문자 출력이니까 toUpperCase로 해도 좋을 것 같다.

        int[] alpha = new int[26];
        // 알파벳 순으로 등장 개수 넣을 배열
        int max_index = 0;
        // 빈도 수 가장 높은 알파벳의 index
        int count = 0;

        // 1번 for문: 입력 받은 문자열을 알파벳 하나씩 돌면서 알파벳 몇 번 나왔는지 세기
        for(char t : s.toCharArray()){
            alpha[ t-'a']++;
        }

        // 2번 for문: 배열 돌면서 가장 많이 나온 알파벳의 index 찾기
        for(int i=0; i<26; i++){
            if(alpha[i] > alpha[max_index])
                max_index=i;
        }

        // 3번 for문: 빈도 수 가장 많은 알파벳이 몇 개인지 찾기
        for(int i=0; i<26; i++){
            if(alpha[i]== alpha[max_index])
                count++;
        }
        
        // 최빈 알파벳 여러 개이면 ?출력. 아니면 max_index에 해당하는 알파벳 대문자 출력
        if(count > 1)
            System.out.print("?");
        else
            System.out.print((char)(max_index + 'A'));
    }
}
