import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            String a = sc.nextLine();
            set.add(a);
        }
        for(int i=0; i<m; i++){
            String b = sc.nextLine();
            if(set.contains(b)){
                list.add(b);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(String s : list){
            System.out.println(s);
        }
    }
}
