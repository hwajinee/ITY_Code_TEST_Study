import java.util.Scanner;

public class BOJ_1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int[] counter1 = new int[26];
        int[] counter2 = new int[26];
        int del = 0;
        int count = 0;

        for (char a : s1.toCharArray()){
            counter1[a - 'a']++;
        }
        for(char b : s2.toCharArray()){
            counter2[b - 'a']++;
        }

        for(int i=0; i<26; i++){
            del = counter1[i] - counter2[i];
            if(del != 0){
                count += Math.abs(del);
            }
        }
        System.out.print(count);
    }
}