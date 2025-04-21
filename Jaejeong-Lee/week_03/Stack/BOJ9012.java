package week_03.Stack;

import java.util.*;

public class BOJ9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<>();

        int times = sc.nextInt();
        sc.nextLine();

        // 1. 2차원 ArrayList에 입력값 넣기
        ArrayList<ArrayList<String>> ps = new ArrayList<>();

        for (int i =0; i < times; i++) {
            ArrayList<String> ps1 = new ArrayList<>();
            String paren = sc.nextLine();
            String[] parenArray = paren.split("");

//            for (String p : parenArray) {
//                ps1.add(p);
//            }
            // 개선 방법
            // Collections.addAll(넣고 싶은 배열 공간, 넣을 배열);
            // : 배열을 요소 살려서 한번에 넣을 수 있는 함수
            Collections.addAll(ps1,parenArray);
            ps.add(ps1);
        }

        // 2. 괄호 하나씩 비교하며 deque에 넣고, YES/NO 판별 및 출력
        for (int i = 0 ; i < times;i++) {
            boolean isValid = true;
            for (int j = 0; j < ps.get(i).size(); j++) {
                String current = ps.get(i).get(j);
                if (current.equals("(")) {
                    deque.push(current);
                } else {
                    if (deque.isEmpty()) {
                        isValid=false;
                        break;
                    } else {
                        deque.pop();
                    }
                }
            }

            // 열린 괄호만 입력되고, 닫힌 괄호는 입력 없는 경우를 대비하여
            // deque가 남아있는지로 확인
            if (!deque.isEmpty()){
                isValid = false;
            }

            System.out.println(isValid ? "YES" : "NO");
            deque.clear();
        }
    }
}

// Arraylist의 2차원 배열에 각각 요소 넣고
// deque에 열린 괄호 들어갈 때 닫힌 괄호로 넣은 뒤
// 닫힌 괄호 나오면 비교해서 없애는 방식으로 추후 진행.


// 중간 확인용 - ArrayList 출력
//        for (ArrayList<String> row : ps) {
//            for (String ch : row) {
//                System.out.print(ch+" ");
//            }
//            System.out.println();
//        }


        /*
        입력 받고
        괄호는 미리 해쉬맵으로 -> 어차피 ( ) 라 할 필요 X
        여는 괄호의 반대 괄호를 저장해둔 후,
        그거랑 매치하기.
        */