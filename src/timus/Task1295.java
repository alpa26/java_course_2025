package timus;

import java.math.BigInteger;
import java.util.Scanner;

public class Task1295 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        BigInteger num = BigInteger.ONE.pow(N)
                .add(BigInteger.valueOf(2).pow(N))
                .add(BigInteger.valueOf(3).pow(N))
                .add(BigInteger.valueOf(4).pow(N));
        int count = 0;

        while (num.mod(BigInteger.valueOf(10)).equals(BigInteger.valueOf(0)))
        {
            count ++;
            num = num.divide(BigInteger.valueOf(10));
        }
        System.out.println(count);
    }
}
