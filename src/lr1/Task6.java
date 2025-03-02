package lr1;
import java.time.Year;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = in.nextLine();

        System.out.println("Введите свой год рождения:");
        int year = in.nextInt();

        System.out.printf("Ваше имя %s, ваш возраст %d \n",name,Year.now().getValue()-year);
        in.close();
    }
}
