package lr2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner id = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String text = id.nextLine();
        System.out.println("Введите ключ");
        int shift = id.nextInt();
        id.nextLine();
        System.out.println("Текст после преобразования:");
        String res = encrypt(text,shift);
        System.out.println(res);
        while (true){
            System.out.println("Выполнить обратное преобразование? (y/n):");
            String answ = id.nextLine();
            if (answ.equals("y"))
            {
                System.out.println("Исходная строка:");
                System.out.println(decrypt(res,shift));
                break;
            }
            else if (answ.equals("n"))
                break;
            else
                System.out.println("Введите корректный ответ");
        }
        System.out.println("До свидания");
    }

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char i : text.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    result.append((char) ('А' + (i - 'А' + shift) % 33));
                } else {
                    result.append((char) ('а' + (i - 'а' + shift) % 33));
                }
            } else {
                result.append(i);
            }
        }

        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 33 - shift);
    }
}
