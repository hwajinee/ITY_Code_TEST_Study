import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ_11507 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[4];
        Set<String> set = new HashSet<>();
        String s = sc.nextLine();


        // 1번 for문: 문자열 3개씩 자르고, set에 존재하는지 여부 판별
        for(int i = 0; i <s.length(); i+=3){
            String card = s.substring(i, i+3);
            if(set.contains(card)){
                System.out.println("GRESKA");
                return;
            }
            else{
                set.add(card);
            }

            // card의 모양에 따라 count 증가
            char shape = card.charAt(0);
            if(shape == 'P')
                count[0]++;
            else if(shape == 'K')
                count[1]++;
            else if(shape == 'H')
                count[2]++;
            else if(shape == 'T')
                count[3]++;
        }

        // 2번 for문: 잃어버린 카드 갯수 모양별로 출력
        for(int i : count){
            System.out.print((13-i) + " ");
        }
    }
}
