package lr1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = in.nextLine();

        System.out.println("Введите возраст:");
        int age = in.nextInt();

        System.out.printf("Имя пользователя: %s \nВозраст пользователя: %d лет \n", name,age);
        in.close();
    }
}
