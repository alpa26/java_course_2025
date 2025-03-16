package lr2;

import java.time.Year;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args){
        Random random = new Random();
        int minValue = Integer.MAX_VALUE;
        int arraySize = 100;
        int[] randomNumbers = new int[arraySize];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(10000);
            if (randomNumbers[i]  < minValue)
                minValue = randomNumbers[i];
        }
        System.out.println("Массив: " + Arrays.toString(randomNumbers));
        for (int i = 0; i < randomNumbers.length; i++) {
            if(randomNumbers[i] == minValue)
                System.out.printf("Минимальное значение: %d, индекс: %d \n", randomNumbers[i],i);
        }
    }
}
