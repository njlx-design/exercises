package CircalyLinkedList;
import SinglyLinkedList.SinglyLinkedList;


public class Mani {
    public static void main(String[] args) {
        CircalyLinkedList<String> clist=new CircalyLinkedList<String>();
        clist.addFirst("Afnan");
        clist.addFirst("Nada");
        clist.addlast("Asmaa");
        clist.addlast("Sarah");
        clist.addFirst("Huda");
        clist.removeLast();
        clist.removeFirst();
        clist.display();
    }
}
