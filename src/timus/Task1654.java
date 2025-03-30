package timus;

import java.util.Scanner;
import java.util.Stack;

public class Task1654 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        Stack<Character> stack = new Stack<>();
        stack.push(str1.charAt(0));
        for(int i =1;i<str1.length();i++)
        {
            if(!stack.isEmpty() && str1.charAt(i) == stack.peek())
            {
                stack.pop();
                continue;
            }
            stack.push(str1.charAt(i));
        }
        int n = stack.size();
        for(int i =0;i<n;i++)
            System.out.print(stack.get(i));
    }
}
