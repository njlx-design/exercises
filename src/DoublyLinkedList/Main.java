package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dlist=new DoublyLinkedList<Integer>();
        dlist.addFirest(10);
        dlist.addFirest(70);
        dlist.addFirest(20);
        dlist.addFirest(60);
        dlist.addLast(40);
        dlist.addLast(50);
        dlist.removeFirest();
        dlist.removeLast();
        dlist.display();
    }
}
