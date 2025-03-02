package timus;

import java.util.Scanner;

public class Task1502 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();
        long totalDiamonds = 0;

        for (int i = 0; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                totalDiamonds += (i + j);
            }
        }
        System.out.println(totalDiamonds);
    }
}
