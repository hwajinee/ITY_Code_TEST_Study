package week_05;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int index[] = new int[num];

        int start =0;
        int end = 0;

        for(int i=0;i<index.length;i++)
        {
            index[i] = i+1;
        }

        int sum = 1;
        int count = 1;

        while(start <= end)
        {
            if(sum<num){
                end++;
                sum += index[end];
            }
            else if(sum==num)
            {
                count++;
                end++;
                sum += index[end];
            }
            else {
                sum -= index[start];
                start++;
            }
        }

        System.out.println(count);

    }

}
