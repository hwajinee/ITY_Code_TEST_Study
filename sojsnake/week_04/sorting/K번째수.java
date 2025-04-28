import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int first = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            //array 배열을 first-1 부터 end-1까지 잘라서 arr에 넣기
            int[] arr = Arrays.copyOfRange(array, first-1, end);
            Arrays.sort(arr);
            answer[i] = arr[k-1];
        }
        
        return answer;
    }
}
