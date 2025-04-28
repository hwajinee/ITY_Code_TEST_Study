import java.util.*;
import java.io.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strArr = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            strArr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strArr, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i]);
        }
        if(sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }
}