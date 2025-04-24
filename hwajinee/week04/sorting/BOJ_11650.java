package week04.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        coord[] set = new coord[]{};
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            set[i] = new coord(x, y);
        }

//        Arrays.sort();
    }
}

class coord {
    int x = 0;
    int y = 0;

    coord(int x, int y){
        this.x = x;
        this.y = y;
    }
}