package week_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17478 {
    public static void main(String[] args) throws IOException {
//        boj 17478 재귀함수가 뭔가요?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        whatIsRecursiveFunction(N, 0);
    }

    private static void whatIsRecursiveFunction(int N, int depth) {
        String indent = getIndent(depth);

        System.out.println(indent + "\"재귀함수가 뭔가요?\"");
        if (N == 0) {
            System.out.println(indent + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
        } else {
            System.out.println(indent + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            System.out.println(indent + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            System.out.println(indent + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

            whatIsRecursiveFunction(N - 1, depth + 1);
        }
        System.out.println(indent + "라고 답변하였지.");
    }

    private static String getIndent(int depth) {
        if (depth == 0) {
            return "";
        }
        return getIndent(depth - 1) + "____";
    }
}
