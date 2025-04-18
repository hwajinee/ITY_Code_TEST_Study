import java.util.*;
import java.lang.*;
import java.io.*;

class BOJ_1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        HashMap<String, Integer> map2 = new HashMap <String, Integer>();

        for(int i=0; i<n; i++){
            String name = sc.nextLine();
            map1.put(i+1, name);
            map2.put(name, i+1);
        }
        for(int i=0; i<m; i++){
            String question = sc.nextLine();
            if(Character.isDigit(question.charAt(0))){
                int num = Integer.parseInt(question);
                System.out.println(map1.get(num));
            }
            else{
                System.out.println(map2.get(question));
            }
        }
    }
}