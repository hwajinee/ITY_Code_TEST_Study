// 책 제목과 팔린 개수를 저장해야 함
import java.util.*;

public class BOJ_1302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> sell = new HashMap<>();

        // 1번 for문: key는 책 제목, value는 팔린 개수를 저장하는 map 완성
        for(int i = 0; i<total; i++){
            String title = sc.nextLine();
            if(sell.containsKey(title)){
                sell.put(title, sell.get(title) + 1);
            }
            else{
                sell.put(title, 1);
            }
            // if-else문 쓰지 않고, sell.put(title, sell.getOrDefault(title, 0)+1)가 나을듯
        }
        
        Set<String> keys = sell.keySet();
        int max = 0;

        // 2번 for문: keySet 돌면서 가장 많이 팔린 책의 개수 구하기
        for(String key:keys){
            int value = sell.get(key);
            if(value > max)
                max = value;
        }

        // 3번 for문: 가장 많이 팔린 책들 제목 arraylist에 넣기
        ArrayList<String> list= new ArrayList<>();
        for(String key:keys){
            if(sell.get(key) == max)
                list.add(key);
        }
        
        // 정렬해서 젤 앞에 것만 출력
        Collections.sort(list);
        System.out.print(list.get(0));
    }
}

// 2번, 3번 for문 쓰는것보다 Map.Entry 쓰는 게 나을듯
int max = 0;
ArrayList<String> list = new ArrayList<>();

for (Map.Entry<String, Integer> entry : sell.entrySet()) {
    int value = entry.getValue();
    String title = entry.getKey();

    if (value > max) {
        max = value; // max 갱신되면,
        list.clear(); // 기존에 들어왔던 책 제목들 지움 -> list에는 1위인 책들만
        list.add(title);
    } 
    else if (value == max) {
        list.add(title); // 공동 1위도 넣음
    }
}
