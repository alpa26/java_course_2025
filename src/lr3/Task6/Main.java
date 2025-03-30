package lr3.Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner id = new Scanner(System.in);
        System.out.println("Введите кол-во элементов:");
        int N = id.nextInt();
        Program1.Do(N);
        Program2.Do(N);
    }
}
