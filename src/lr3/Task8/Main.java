package lr3.Task8;

public class Main {
    public static void main(String[] args){
        LinearList list = new LinearList();
        list.createHead(1);
        list.createTail(100);
        System.out.println(list.toString());
        list.AddFirst(new Node(2,null));
        list.AddLast(new Node(101,null));
        list.Insert(new Node(102,null),1);
        list.RemoveFirst();
        list.RemoveLast();
        list.Remove(1);
        list.createHeadRec(10);
        list.createTailRec(11);
        System.out.println(list.toStringRec());
    }
}
