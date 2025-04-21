import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_1343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String board = sc.nextLine();
//        .을 기준으로 분할
        String[] blocks = board.split("\\.");

//        블록별로 변환 후 저장해 둘 배열
        ArrayList<String> result = new ArrayList<>();

        for(String block : blocks){
            int length = block.length();
            StringBuilder converted = new StringBuilder();

//          홀수이면 무조건 -1
            if(length % 2 != 0){
                System.out.println("-1");
                return;
            }

//          4개당 AAAA 하나, AAAA 들어가고 나머지 2개당 BB
            int a = length / 4;
            int b = (length % 4)/2;

//           append(): 문자열 끝에 주어진 문자열 추가
            for(int i=0; i<a; i++){
                converted.append("AAAA");
            }
            for(int j=0; j<b; j++){
                converted.append("BB");
            }
//            변환된 블록 ArrayList에 저장
            result.add(converted.toString());
        }
//        변환된 문자열 다시 . 붙이기(block과 block 사이에)
        StringBuilder finalResult = new StringBuilder();
        for(int k=0; k<result.size(); k++){
//           ArrayList 요소 하나씩 가져와서 SB에 추가
            finalResult.append(result.get(k));
//            마지막꺼 빼고 블록 사이에 점 붙이기
            if(k < result.size() -1){
                finalResult.append(".");
            }
        }
        System.out.print(finalResult.toString());
    }
}
