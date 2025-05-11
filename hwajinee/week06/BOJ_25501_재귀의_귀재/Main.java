package week06.BOJ_25501_재귀의_귀재;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String str = br.readLine().trim();
            isPalinfrome(str, 0 , str.length()-1);
        }
    }

    public static int count = 1;
    public static void isPalinfrome(String s, int l, int r){
        if(l >= r) {
            System.out.println(1 + " " + count);
            count = 1;
        }
        else if(s.charAt(l) != s.charAt(r)) {
            System.out.println(0 + " " + count);
            count = 1;
        }
        else {
            count++;
            isPalinfrome(s, l+1, r-1);
        }
    }
}
