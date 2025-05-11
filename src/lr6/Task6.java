package lr6;
import java.util.*;
public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер:");
        int size = in.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
            array[i] = random.nextInt(1000);
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма:");
        System.out.println(findMaxElement(array));
    }
    public static int findMaxElement (int[] array) throws InterruptedException
    {
        int cores = Runtime.getRuntime().availableProcessors()/2;
        List<Integer> arrSum = new ArrayList<>();
        int chunkSize = (array.length <cores )? 1 : array.length / cores;
        Thread[] threads = new Thread[cores];
        for (int i = 0; i < cores; i++) {
            if(i> array.length-1)
                continue;
            int start = i * chunkSize;
            int end = (i == cores - 1) ? array.length : start + chunkSize;
            threads[i] = new Thread(() -> {
                int localSum = 0;
                for (int j = start; j < end; j++)
                    localSum += array[j];
                arrSum.add(localSum);
            });
            threads[i].start();
        }
        for (Thread t : threads) {
            if(t != null)
                t.join();
        }
        return arrSum.stream().mapToInt(Integer::intValue).sum();
    }
}
