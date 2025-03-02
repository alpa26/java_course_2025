package lr1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели:");
        String day = in.nextLine();

        System.out.println("Введите месяц:");
        String month = in.nextLine();

        System.out.println("Введите номер дня в месяце:");
        int monthday = in.nextInt();

        System.out.printf("Сегодняшний день недели: %s \nДата: %d  \nМесяц: %s  ", day,monthday,month);
        in.close();
    }
}
