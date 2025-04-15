package NahyeChoi.week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class BOJ_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> log = new HashSet<>();
        for(int i = 0; i < n; i++){
            String commute = br.readLine();
            String name = commute.split(" ")[0];
            String status = commute.split(" ")[1];

            if(status.equals("enter")){
                log.add(name);
            }else if(status.equals("leave")){
                log.remove(name);
            }else {
                break;
            }
        }

        List<String> logList = new ArrayList<>(log);
        Collections.sort(logList);
        Collections.reverse(logList);
        for(String name : logList){
            System.out.println(name);
        }
    }
}
