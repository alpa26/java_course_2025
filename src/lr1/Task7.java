package lr1;

import java.time.Year;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свой возраст:");
        int age = in.nextInt();

        System.out.printf("Ваш год рождения: %d \n", Year.now().getValue()-age);
        in.close();
    }
}
