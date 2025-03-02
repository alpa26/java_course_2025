package lr1;
import java.time.Year;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свой год рождения:");
        int year = in.nextInt();

        System.out.printf("Ваш возраст: %d \n",Year.now().getValue()-year);
        in.close();
    }
}
