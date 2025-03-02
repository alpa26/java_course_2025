package lr1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц:");
        String month = in.nextLine();

        System.out.println("Введите кол-во дней в месяце:");
        int monthday = in.nextInt();

        System.out.printf("Месяц %s содержит следующее кол-во дней: %d \n",month,monthday);
        in.close();
    }
}
