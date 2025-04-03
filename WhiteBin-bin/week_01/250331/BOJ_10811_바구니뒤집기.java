import java.util.Scanner;

public class BOJ_10811_바구니뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = sc.nextInt();
        int temp=0;
        int basket[] = new int[n];
        for(int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }
        for(int j = 0; j < count; j++) {
            int left = sc.nextInt() -1;
            int right = sc.nextInt() - 1;

            while (left < right) {
                temp = basket[left];
                basket[left] = basket[right];
                basket[right] = temp;
                left++;
                right--;
            }
        }
        sc.close();

        for(int u = 0; u < basket.length; u++){
            System.out.print(basket[u] + " ");
        }
    }
}
