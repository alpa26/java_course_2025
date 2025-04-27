package timus;

import java.math.BigInteger;
import java.util.Scanner;

public class Task1402 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger count = BigInteger.ZERO;
        if(n<2)
            System.out.println(0);
        else{
            for(int i = 2;i<=n;i++)
                count = count.add(fact(BigInteger.valueOf(n),i));
            System.out.println(count);
        }
    }

    public static BigInteger fact (BigInteger number,int len)
    {
        if(len == 0)
            return BigInteger.ONE;
        return number.multiply(fact(number.subtract(BigInteger.ONE), len-1));
    }
}
