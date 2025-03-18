package timus;

import java.util.*;

public class Task1263 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        String[] part = in.nextLine().split(" ");;
        int N = Integer.parseInt(part[0]);
        int M = Integer.parseInt(part[1]);
        int[] res = new int[N];
        for(int i = 0; i < M; i++) {
            int k = in.nextInt();
            res[k-1] ++;
        }
        for(int i = 0; i < N; i++) {
            double percentage = (res[i] * 100.0) / M;
            System.out.printf("%.2f%%\n", percentage);        }
    }
}
