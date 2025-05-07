package week_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12891 {
    public static void main(String[] args) throws IOException {
//        BOJ 12891
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        // 임의로 만든 DNA 문자열
        String dnaStr = br.readLine();
        char[] dna = dnaStr.toCharArray();

        // 부분 문자열에 포함되어야 할 (A, C, G, T) 최소 개수가 공백으로 구분
        st = new StringTokenizer(br.readLine());
        int[] minDNA = new int[4];
        for (int i = 0; i < 4; i++) {
            minDNA[i] = Integer.parseInt(st.nextToken());
        }

        int[] checkDNA = new int[4]; //현재 윈도우 내 DNA 개수
        int count = 0;

        // 초기 윈도우
        for (int i = 0; i < P; i++) {
            add(dna[i], checkDNA);
        }
        if (isValid(checkDNA, minDNA)) {
            count++;
        }

        // 슬라이딩 윈도우
        for (int i = P; i < S; i++) {
            add(dna[i], checkDNA); // 새 문자 추가
            remove(dna[i - P], checkDNA); // 앞에 문자 제거
            if (isValid(checkDNA, minDNA)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static void add(char c, int[] checkDNA) {
        switch (c) {
            case 'A':
                checkDNA[0]++;
                break;
            case 'C':
                checkDNA[1]++;
                break;
            case 'G':
                checkDNA[2]++;
                break;
            case 'T':
                checkDNA[3]++;
                break;
        }
    }

    private static void remove(char c, int[] checkDNA) {
        switch (c) {
            case 'A':
                checkDNA[0]--;
                break;
            case 'C':
                checkDNA[1]--;
                break;
            case 'G':
                checkDNA[2]--;
                break;
            case 'T':
                checkDNA[3]--;
                break;
        }
    }

    private static boolean isValid(int[] checkDNA, int[] minDNA) {
        for (int i = 0; i < 4; i++) {
            if (checkDNA[i] < minDNA[i]) {
                return false;
            }
        }
        return true;
    }
}
