import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BOJ_2002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        sc.nextLine();
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            map1.put(s, i+1);
        }
        for(int i=0; i<n; i++){
            String s2 = sc.nextLine();
            map2.put(s2, i+1);
        }
        Set<String> keys = map1.keySet();
        for(String key : keys){
            if(map1.get(key) > map2.get(key))
                count++;
        }
        System.out.print(count);
    }
}
