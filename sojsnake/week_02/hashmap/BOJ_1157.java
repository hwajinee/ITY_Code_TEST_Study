import java.util.Scanner;

public class BOJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        int[] alpha = new int[26];
        int max_index = 0;
        int count = 0;

        for(char t : s.toCharArray()){
            alpha[ t-'a']++;
        }
        for(int i=0; i<26; i++){
            if(alpha[i] > alpha[max_index])
                max_index=i;
        }

        for(int i=0; i<26; i++){
            if(alpha[i]== alpha[max_index])
                count++;
        }
        if(count > 1)
            System.out.print("?");
        else
            System.out.print((char)(max_index + 'A'));
    }
}