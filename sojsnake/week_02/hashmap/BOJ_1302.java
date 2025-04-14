import java.util.*;

public class BOJ_1302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> sell = new HashMap<>();

        for(int i = 0; i<total; i++){
            String title = sc.nextLine();
            if(sell.containsKey(title)){
                sell.put(title, sell.get(title) + 1);
            }
            else{
                sell.put(title, 1);
            }
        }
        Set<String> keys = sell.keySet();
        int max = 0;
        for(String key:keys){
            int value = sell.get(key);
            if(value > max)
                max = value;
        }
        ArrayList<String> list= new ArrayList<>();
        for(String key:keys){
            if(sell.get(key) == max)
                list.add(key);
        }
        Collections.sort(list);
        System.out.print(list.get(0));
    }
}
