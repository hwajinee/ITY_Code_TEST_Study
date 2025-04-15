import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();


        // 1번 for문: 듣도 못한 사람 n명 set에 넣기
        for(int i=0; i<n; i++){
            String a = sc.nextLine();
            set.add(a);
        }

        // 2번 for문: 겹치는 사람만 list에 넣기
        for(int i=0; i<m; i++){
            String b = sc.nextLine();
            if(set.contains(b)){
                list.add(b);
            }
        }

        // list 사전순으로 정렬
        Collections.sort(list);
        
        System.out.println(list.size());
        for(String s : list){
            System.out.println(s);
        }
    }
}
