package HashMap;

import java.util.Scanner;
import java.util.HashMap;

public class BOJ1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String upperWord = word.toUpperCase();

        HashMap<Character,Integer> map = new HashMap<>();
        char [] letterArray = upperWord.toCharArray();
        for( char letter : letterArray ) {
            if( map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter,1);
            }
        }
        int max = 0;
        char result = '?';
        for ( char key : map.keySet()) {
            int value = map.get(key);
            if (value > max) {
                max = value;
                result = key;
            } else if (value == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}