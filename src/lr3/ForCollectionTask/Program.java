package lr3.ForCollectionTask;

import java.util.*;

public class Program {
    public static void main(String[] args){

        System.out.println("\nСоздадим  коллекции с длинной 7 000 000");
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int N = 7000000;
        fillCollection(arrayDeque,N);
        fillCollection(arrayList,N);
        fillCollection(linkedList,N);

        System.out.println("Добавление элемента в начало:");

        measureTime(() -> arrayList.add(0, 1000), "ArrayList");
        measureTime(() -> linkedList.add(0, 1000), "LinkedList");
        measureTime(() -> arrayDeque.addFirst(1000), "ArrayDeque");

        System.out.println("\nДобавление элемента в конец:");
        measureTime(() -> arrayList.add(1000), "ArrayList");
        measureTime(() -> linkedList.add(1000), "LinkedList");
        measureTime(() -> arrayDeque.addLast(1000), "ArrayDeque");

        System.out.println("\nДобавление элемента в середину:");
        measureTime(() -> arrayList.add(N / 2, 1000), "ArrayList");
        measureTime(() -> linkedList.add(N / 2, 1000), "LinkedList");
        // ArrayDeque не поддерживает добавление элемента в середину

        System.out.println("\nУдаление элемента из начала:");
        measureTime(() -> arrayList.remove(0), "ArrayList");
        measureTime(() -> linkedList.remove(0), "LinkedList");
        measureTime(() -> arrayDeque.removeFirst(), "ArrayDeque");

        System.out.println("\nУдаление элемента из конца:");
        measureTime(() -> arrayList.remove(arrayList.size() - 1), "ArrayList");
        measureTime(() -> linkedList.remove(linkedList.size() - 1), "LinkedList");
        measureTime(() -> arrayDeque.removeLast(), "ArrayDeque");

        System.out.println("\nУдаление элемента из середины:");
        measureTime(() -> arrayList.remove(N / 2), "ArrayList");
        measureTime(() -> linkedList.remove(N / 2), "LinkedList");
        // ArrayDeque не поддерживает удаление элемента из середины


        System.out.println("\nПолучение элемента по индексу:");
        measureTime(() -> arrayList.get(arrayList.size() / 2), "ArrayList");
        measureTime(() -> linkedList.get(arrayList.size() / 2), "LinkedList");
        // ArrayDeque не поддерживает получение элемента по индексу
    }

    private static void fillCollection(Collection<Integer> collection,long N) {
        for (int i = 0; i < N; i++)
            collection.add(i);
    }

    private static void measureTime(Runnable operation, String collection) {
        long startTime = System.nanoTime();
        operation.run();
        long endTime = System.nanoTime();
        System.out.printf("%s: %d ns%n", collection, (endTime - startTime));
    }
}
