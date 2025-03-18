package timus;

import java.util.Scanner;

public class Task2035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] part = in.nextLine().split(" ");;
        int X = Integer.parseInt(part[0]);
        int Y = Integer.parseInt(part[1]);
        int C = Integer.parseInt(part[2]);
        if (C > X + Y) {
            System.out.println("Impossible");
        } else {
            int A = Math.min(X, C);
            int B = C - A;
            if (B <= Y) {
                System.out.println(A + " " + B);
            } else {
                System.out.println("Impossible");
            }
        }
    }
}
