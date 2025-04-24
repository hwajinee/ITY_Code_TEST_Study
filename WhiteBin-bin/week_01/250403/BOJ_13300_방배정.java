import java.io.*;

public class BOJ_13300_방배정 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstInput = br.readLine().split(" ");
        int student = Integer.parseInt(firstInput[0]);
        int room = Integer.parseInt(firstInput[1]);

        int[][] array = new int[6][2];

        for (int i = 0; i < student; i++) {
            String[] line = br.readLine().split(" ");
            int sung = Integer.parseInt(line[0]);
            int grade = Integer.parseInt(line[1]) - 1;
            array[grade][sung]++;
        }

        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                int people = array[i][j];
                if (people == 0) continue;
                count += (people + room - 1) / room;
            }
        }

        System.out.println(count);
    }
}
