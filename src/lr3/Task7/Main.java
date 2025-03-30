package lr3.Task7;

import lr3.Task7.Node;

public class Main {
    public static void main(String[] args) {
        // Создадим линейный однонаправленный список с добавлением элемента в начало списка
        Node listByHead = null;
        for (int i = 9; i >=0; i--)
            listByHead = new Node(i,listByHead);

        // Создадим линейный однонаправленный список с добавлением элемента в конец списка
        Node listByTail = new Node(0, null);
        for (int i = 1; i < 10; i++)
        {
            Node newtail = new Node(i, null);
            Node ref = listByTail;
            while (ref.next != null) {
                ref = ref.next;
            }
            ref.next = newtail;
        }
        System.out.println(" ");
    }
}
