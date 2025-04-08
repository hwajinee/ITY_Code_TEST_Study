import java.util.Scanner;

public class BOJ_2738_행렬덧셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrixA = new int[n][m];
        int[][] matrixB = new int[n][m];
        int[][] count = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <m; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
        for(int k = 0; k < n; k++) {
            for(int l = 0; l < m; l++) {
                matrixB[k][l] = sc.nextInt();
            }
        }

        for(int ik = 0; ik < n; ik++) {
            for(int jl = 0; jl < m; jl++) {
                count[ik][jl] = matrixA[ik][jl] + matrixB[ik][jl];
                System.out.print(count[ik][jl] + " ");
            }
            System.out.println();
        }

    }
}
