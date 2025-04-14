import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        for(int j = 0; j < completion.length; j++){
            map.put(completion[j], map.getOrDefault(completion[j], 0) - 1);
        }
        for(String a : map.keySet()) {
            if(map.get(a) > 0) {
                return a;
            };
        }
        return "";
    }
}