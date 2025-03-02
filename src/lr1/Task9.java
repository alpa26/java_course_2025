package lr1;
import java.lang.Math;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();

        System.out.printf("%d, %d, %d, %f", num-1,num,num+1,Math.pow((num-1 + num + num+1), 2));
        in.close();
    }
}
