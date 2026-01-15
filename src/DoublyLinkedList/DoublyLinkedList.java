package DoublyLinkedList;

public class DoublyLinkedList<E> {
    private Node<E>head;
    private Node<E>tail;
    private int size;

    //constractr تفس تهيئ العمليه
    public DoublyLinkedList(){
        head=new Node(null,null,null);
        tail=new Node(head,null,null);
        head.setNext(tail);
        size=0;
    }
    public int size(){return size;}

    public boolean isEmpty(){
        return size()==0;
    }
    public E getFirest(){
        return tail.getNext().getData();
    }

    public E getLast(){
        return tail.getPrev().getData();
    }

    private void addBetween(Node<E> left, E data,Node<E> right){
        Node<E> newNode=new Node(left,data,right);
        left.setNext(newNode);
        right.setPrev(newNode);
        size++;
    }



    public void addFirest(E data){
        addBetween(head,data,head.getNext());
    }

    public void addLast(E data){

        addBetween(tail.getPrev(),data,tail);
    }

    private E remove(Node<E> deletedNode){
        if(isEmpty())
            return null;
        E delete=deletedNode.getData();
        Node<E> left=deletedNode.getPrev();
        Node<E> right=deletedNode.getNext();
        left.setNext(right);
        right.setPrev(left);
        size--;
        return delete;

    }
    public E removeFirest(){
        return remove(head.getNext());

    }

    public E removeLast(){
        return remove(head.getPrev());

    }
    public void display(){
        if(isEmpty()){
            System.out.println("list is empty");
            return;
        }

        Node<E>temp=head.getNext();
        System.out.println("null<---head<---->");
        while (temp!=tail){
            System.out.println(temp.getData()+"<----->");
            temp=temp.getNext();
        }
        System.out.println("tail---->null");

    }



    //نكون نوود
    class Node<E>{
        private Node<E>prev;
        private E data;
        private Node<E> next;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
