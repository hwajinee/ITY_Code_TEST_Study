import java.util.*;
import java.util.Scanner;

class BOJ_7785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, String> map= new HashMap <String, String>();
        List<String> enterList = new ArrayList<>();
        for (int i=0; i< n ; i ++){
            String[] line= sc.nextLine().split(" ");
            map.put(line[0], line[1]);
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("enter")){
                String s = entry.getKey();
                enterList.add(s);
            }
        }
        enterList.sort(Collections.reverseOrder());
        for (String name : enterList) {
            System.out.println(name);
        }
    }
}