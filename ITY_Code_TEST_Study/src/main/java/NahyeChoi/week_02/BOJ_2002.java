package NahyeChoi.week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2002 {
    public static void boj_2002() throws IOException {
        //        2002 추월
//        1) 입력 받기(차의 대수 : N)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

//        2) 차량 목록 및 번호 선언
        HashMap<String, Integer> enterCars = new HashMap<>(); //들어온 차량
        List<String> exitCars =  new ArrayList<>(); //나간 차량 목록
        String carNumber = "";

//        3) N만큼 들어온 차량, 나간 차량 목록 채우기
        for(int i = 0; i < N; i++) {
            carNumber = br.readLine();
            enterCars.put(carNumber,i);
        }
        for(int i = 0; i < N; i++) {
            carNumber = br.readLine();
            exitCars.add(carNumber);
        }

//        4) 추월 계산
        int cnt = 0;
        Set<String> exited = new HashSet<>();  // 나간 차량 중 이미 처리한 차량
        for (int i = 0; i < N; i++) {
            String currentCar = exitCars.get(i);
            exited.add(currentCar);

            // 현재 나간 차량보다 늦게 들어온 차량 중 이미 나간 차가 있다면 추월(cnt++)
            for (int j = i + 1; j < N; j++) {
                String nextCar = exitCars.get(j);
                if (enterCars.get(currentCar) > enterCars.get(nextCar)) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
