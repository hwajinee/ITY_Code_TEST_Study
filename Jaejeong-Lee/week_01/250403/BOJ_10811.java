import java.util.Scanner;

public class BOJ_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        for ( int i = 0 ; i < n ; i++) {
            arr1[i] = i+1;
            arr2[i] = arr1[i];
        }
//      여기까지 일단 1차원 배열 arr1에 12345 넣어줌.
// 이제 1 2 입력 받고 바꿔줄 차례
        while (true) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            for ( int i = num1-1 ; i < num2 ; i++) {
//              여기서 1번째부터 2번째까지 바꿔주는 코드 작성
//                arr1[i] = arr2[num2-1-i];
            }
        }

//        String input = sc.nextLine();

    }
}

// 12345 // 초기 상태
// 21345 // 1 2
// 21435 // 3 4
// 34125 // 1 4
// 34125 // 2 2 // 결과값
