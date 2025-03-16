package lr2.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = in.nextLine();
        System.out.println("Введите возраст:");
        int age = in.nextInt();
        System.out.println("Введите пол (М/Ж):");
        String sex = in.nextLine();
        Person man = new Person(name,age,sex);

        System.out.printf("Имя человека %s, пол %s, возраст %d \n", man.Name, man.Sex, man.Age);
    }
}
