import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ_11507 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[4];
        Set<String> set = new HashSet<>();
        String s = sc.nextLine();

        for(int i = 0; i <s.length(); i+=3){
            String card = s.substring(i, i+3);
            if(set.contains(card)){
                System.out.println("GRESKA");
                return;
            }
            else{
                set.add(card);
            }
            char shape = card.charAt(0);

            if(shape == 'P')
                count[0]++;
            else if(shape == 'K')
                count[1]++;
            else if(shape == 'H')
                count[2]++;
            else if(shape == 'T')
                count[3]++;
        }
        for(int i : count){
            System.out.print((13-i) + " ");
        }
    }
}
