import java.util.Scanner;

public class BOJ_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bucket = new int[n];

        for(int i=0; i<n; i++){
            bucket[i] = i+1;
        }
        for(int k=0; k<m; k++){
            int i = sc.nextInt() -1;
            int j = sc.nextInt() -1;

            while(i < j) {
                int temp = bucket[i];
                bucket[i] = bucket[j];
                bucket[j] = temp;
                i++;
                j--;
            }
        }
        for(int t : bucket){
            System.out.print(t + " ");
        }
    }
}