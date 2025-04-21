import java.util.Scanner;

public class BOJ_11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        while(true){
            str = sc.nextLine();
            if (str.equals("END")) {
                break;
            }
            StringBuffer sb = new StringBuffer(str);
            String reverse = sb.reverse().toString();
            System.out.println(reverse);
        }
    }
}
