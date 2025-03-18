package timus;

import java.util.Scanner;

public class Task1876 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] part = in.nextLine().split(" ");;
        int a = Integer.parseInt(part[0]);
        int b = Integer.parseInt(part[1]);
        if(a>b)
            System.out.println(39*2 + 40 + (a-40)*2 + 1);
        else
            System.out.println(b*2 + 40);
    }
}
