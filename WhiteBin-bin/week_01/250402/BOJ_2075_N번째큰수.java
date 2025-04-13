import java.io.*;
import java.util.*;

public class BOJ_2075_N번째큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] temp;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for(int i = 0; i < n; i++) {
            temp = br.readLine().split(" ");
            for(int j = 0; j < temp.length; j++) {
                priorityQueue.add(Integer.parseInt(temp[j]));
            }
        }

        int answer = 0, count = 0;

        while(count < n) {
            answer = priorityQueue.poll();
            count++;
        }

        System.out.println(answer);
    }
}
