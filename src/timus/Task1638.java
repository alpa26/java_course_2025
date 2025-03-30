package timus;

import java.util.Scanner;

public class Task1638 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] elements = in.nextLine().split(" ");
        int a1 = Integer.parseInt(elements[3]);
        int a2 = Integer.parseInt(elements[2]);
        if(a1>a2)
        {
            int count = a1-a2;
            System.out.println(count * 2 * Integer.parseInt(elements[1])+ (count-1)  * Integer.parseInt(elements[0]));
        } else {
            int count = a2-a1;
            System.out.println(count * 2 * Integer.parseInt(elements[1])+ (count+1)  * Integer.parseInt(elements[0]));
        }
    }
}
