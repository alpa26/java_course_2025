package lr3.Task6;
import java.util.LinkedList;

public class Program2 {
    public static void Do(int N){
        LinkedList<Integer> circle = new LinkedList<>();
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
        System.out.println("LinkedList: Остался один человек");
        System.out.println("LinkedList: Время выполнения " + (endTime - startTime) + " наносекунд");
    }
}
