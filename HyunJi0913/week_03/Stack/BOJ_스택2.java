package week_03.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_스택2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++)
        {
            int num = sc.nextInt();

            switch (num)
            {
                case 1:
                    int addnum = sc.nextInt();
                    stack.add(addnum);
                    break;
                case 2:
                    if(stack.isEmpty())
                    {
                        System.out.println("-1");
                    }
                    else {
                        System.out.println(stack.pop());
                    }
                    break;
                case 3:
                    System.out.println(stack.size());
                    break;
                case 4:
                    if(stack.isEmpty())
                    {
                        System.out.println("1");
                    }
                    else {
                        System.out.println("0");
                    }
                    break;
                case 5:
                    if(!stack.isEmpty())
                    {
                        System.out.println(stack.peek());
                    }
                    else{
                        System.out.println("-1");
                    }
                    break;
            }
        }
    }
}
