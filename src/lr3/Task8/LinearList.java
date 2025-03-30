package lr3.Task8;

public class LinearList {
    private static Node node;

    public LinearList(){
        node = new Node(0, null);
    }

    public void createHead(int value){
        node = new Node(value, node);
    }

    public void createTail(int value){
        Node newtail = new Node(value, null);
        Node ref = node;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newtail;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node ref = node;
        while (ref != null) {
            sb.append(" " + ref.value);
            ref = ref.next;
        }
        return sb.toString();
    }

    public void AddFirst(Node newhead){
        newhead.next = node;
        node = newhead;
    }

    public void AddLast(Node newtail){
        newtail.next = null;
        Node ref = node;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newtail;
    }

    public void Insert(Node newnode,int index){
        Node ref = node;
        if(index < 0 ){
            System.out.println("\nИндекс меньше 0:");
            return;
        }
        if(index == 0 ){
            AddFirst(newnode);
            return;
        }
        int k=1;
        while (ref.next!= null && ( k < index )) {
            ref = ref.next;
            k++;
        }
        newnode.next= ref.next;
        ref.next=newnode;
    }

    public void RemoveFirst(){
        node = node.next;
    }

    public void RemoveLast(){
        Node ref = node;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next=null;
    }

    public void Remove(int index){
        Node ref = node;
        int k=1;
        while (ref.next != null && (k < index)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
    }
// Рекурсия
    public void createHeadRec(int value){
        node = new Node(value, node);
    }

    public void createTailRec(int value) {
        if (node == null) node = new Node(value, null);
        else
            createTailRecHelper(value, node);
    }

    private void createTailRecHelper(int value, Node CurrentNode) {
        if (CurrentNode.next != null) createTailRecHelper(value, CurrentNode.next);
        else CurrentNode.next = new Node(value, null);
    }

    public String toStringRec() {
        if (node == null)
            return "Null";
        else{
            StringBuilder sb = new StringBuilder();
            toStringRecHelper(sb,node);
            return sb.toString();
        }
    }

    private static void toStringRecHelper(StringBuilder sb, Node CurrentNode) {
        sb.append(" " + CurrentNode.value);
        if (CurrentNode.next != null)
            toStringRecHelper(sb, CurrentNode.next);
    }
}
