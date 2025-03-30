package lr3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    private static  Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите поочередно элементы массива:");
        setArray(arr,0);
        System.out.println("Ваш массив:");
        getArray(arr,0);
        in.close();
    }

    public static void setArray(int[] arr, int position) {
        if(position > arr.length-1)
            return;
        int el = in.nextInt();
        arr[position] = el;
        setArray(arr,position+1);
    }

    public static void getArray(int[] arr, int position) {
        if(position > arr.length-1)
            return;
        System.out.print(arr[position] + " ");
        getArray(arr,position+1);
    }
}
