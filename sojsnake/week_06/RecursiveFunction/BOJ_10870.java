import java.util.Scanner;

public class BOJ_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fibo(n);
        System.out.println(result);
    }
    public static int fibo(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        return fibo(n-2) + fibo(n-1);
    }
}
