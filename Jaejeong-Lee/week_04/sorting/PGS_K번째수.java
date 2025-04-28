package week_04.sorting;

import java.util.Arrays;

public class PGS_K번째수 {
    public static void main(String[] args) {
        int [] array = {1,5,2,6,3,7,4};
        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };
        int[] answer = solution( array, commands);
        System.out.println(Arrays.toString(answer));
        // return : [5, 6, 3]
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            int k = commands[i][2]-1;

            int[] sliced;

            if (start != end) {
                sliced = new int [end - start+1];
            } else {
                sliced = new int [1];
            }

            if (start == end) {
                sliced[0] = array[start];
            } else {
                for (int j = 0; j <= end - start; j++) {
                    sliced[j] = array[start + j ];
                }
            }
            Arrays.sort(sliced);
            answer[i]=sliced[k];
        }
        return answer;
    }
}