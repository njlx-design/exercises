package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
        list.addLast(30);
        list.addLast(20);
        list.addFirst(10);
        list.addFirst(5);
        list.removeFirst();
        list.display();
    }
}
