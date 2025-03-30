package lr3.Task6;
import java.util.ArrayList;

public class Program1 {
    public static void Do(int N){
        ArrayList<Integer> circle = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }
        long startTime = System.nanoTime();
        int index = 0;
        while (circle.size() > 1) {
            index = (index + 1) % circle.size();
            circle.remove(index);
            index = index % circle.size();
        }
        long endTime = System.nanoTime();

        System.out.println("ArrayList: Остался один человек");
        System.out.println("ArrayList: Время выполнения " + (endTime - startTime) + " наносекунд");
    }
}
