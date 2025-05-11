package timus;

import java.util.Scanner;

public class Task1683 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int res = 0;
        StringBuilder sb = new StringBuilder();
        while(length !=1)
        {
            sb.append(length / 2);
            length = length -  length / 2;
            if (length != 1 )
                sb.append(' ');
            res ++;
        }
        System.out.println(res);
        System.out.println(sb);
    }
}
