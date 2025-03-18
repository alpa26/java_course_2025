package timus;
import java.util.Scanner;

public class Task2031 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Character[] arr = { '1','0','6','8' };

        if (n>4)
            System.out.println("Glupenky Pierre");
        else{
            for(int i = 0; i<n;i++)
            {
                if (i>1)
                    System.out.printf(arr[i]+ "0");
                else
                    System.out.printf(arr[i] +"1");
                if (i != n-1)
                    System.out.print(" ");
            }
        }
    }
}
