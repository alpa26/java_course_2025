package lr2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner id = new Scanner(System.in);
        System.out.println("Введите высоту массива");
        int sizey = id.nextInt();
        System.out.println("Введите ширину массива");
        int sizex = id.nextInt();
        int[][] matrix = new int[sizey][sizex];
        int num = 0;
        for (int i = 0; i < matrix.length; i++){
            if(i % 2 == 0)
                for (int j = 0; j < matrix[i].length; j++){
                    matrix[i][j] = num;
                    num++;
                }
            else
                for (int j = matrix[i].length-1 ; j >= 0; j--){
                    matrix[i][j] = num;
                    num++;
                }
        }
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
