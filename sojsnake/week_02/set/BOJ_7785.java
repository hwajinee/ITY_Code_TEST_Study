import java.util.*;
import java.util.Scanner;

class BOJ_7785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // nextInt로 입력받고 nextLine으로 버퍼에 남아있는 엔터 제거 필요
        sc.nextLine();

        // 이름과 현재 상태 넣을 map
        HashMap<String, String> map= new HashMap <String, String>();
        // 상태가 enter인 사람만 넣을 arraylist
        List<String> enterList = new ArrayList<>();

        // 1번 for문: line을 받아서 빈칸 기준 분리한 후, map에 key는 이름, value는 상태로 put
        for (int i=0; i< n ; i ++){
            String[] line= sc.nextLine().split(" ");
            map.put(line[0], line[1]);
        }

        // 2번 for문: 전체 map을 돌면서, value가 enter인 entry의 key만 arraylist에 넣기
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("enter")){
                String s = entry.getKey();
                enterList.add(s);
            }
        }

        // arraylist 역순으로 정렬
        enterList.sort(Collections.reverseOrder());

        // 3번 for문: arraylist 돌면서 이름 출력
        for (String name : enterList) {
            System.out.println(name);
        }
    }
}



// -------------------------------------------------------------------------------------------
// set을 활용한 풀이법 -> 상태까지 저장해 둘 필요가 없어짐
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        // 이름 저장해 둘 set(중복 불가-중복된 값 들어오면 그냥 무시)
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            String name = line[0];
            String action = line[1];

            // 상태가 enter일 때만 set에 추가하기. leave가 들어오면 제거
            if (action.equals("enter")) {
                set.add(name);
            }
            else {
                set.remove(name);
            }
        }

        List<String> result = new ArrayList<>(set);
        result.sort(Collections.reverseOrder());

        for (String name : result) {
            System.out.println(name);
        }
    }
}
