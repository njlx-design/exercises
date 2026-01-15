package Stack;

import SinglyLinkedList.SinglyLinkedList;

public class SlinkedStack<E> implements Stack <E> {

    SinglyLinkedList<E> list=new SinglyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void push(Object data) {

    }

    @Override
    public E top() {
        return null;
    }

    @Override
    public E pop() {
        return null;
    }
}
