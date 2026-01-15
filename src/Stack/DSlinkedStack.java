package Stack;

import DoublyLinkedList.DoublyLinkedList;

public class DSlinkedStack<E> implements Stack <E> {

    DoublyLinkedList<E> list=new DoublyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E top() {
        return null;
    }

    @Override
    public void push(Object data) {

    }


    @Override
    public E pop() {
        return null;
    }
}
