package CircularLinkedList;

import SinglyLinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
     CircularLinkedList<String> clist=new CircularLinkedList<String>();
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
