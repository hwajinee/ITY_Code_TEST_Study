import java.util.Scanner;

public class BOJ_13300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] girl_grade = new int[6];
        int[] boy_grade = new int[6];
        int room = 0;

        for(int i = 0; i<n; i++){
            int sex = sc.nextInt();
            int grade = sc.nextInt();

            if(sex == 0){
                girl_grade[grade-1]++;
            }
            else{
                boy_grade[grade-1]++;
            }
        }

        for(int x : girl_grade){
            room += (x / k);
            if(x % k != 0){
                room++;
            }
        }
        for(int y : boy_grade){
            room += (y / k);
            if(y % k != 0){
                room++;
            }
        }
        System.out.print(room);


    }
}
