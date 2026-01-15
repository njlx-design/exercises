package Stack;

public class ArrayStack<E> implements Stack<E> {
    private E arr[];
    private int t=-1;
    private static final int CAPICITY=1000;

    public ArrayStack() {
        //تبديل بين الانواع لان الاراي تشتي تعريف للبيانات
       // arr=(E[])new Object[CAPICITY];
        this(CAPICITY);
    }

    public ArrayStack(int c) {
        //تبديل بين الانواع لان الاراي تشتي تعريف للبيانات
        arr=(E[])new Object[c];
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
        //or return t==-1
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E data) {
        if(size()== arr.length){

            //الطريقه البسيطه
           /* System.out.println("stack is full");
            return;*/
            throw new IllegalStateException("stack is full");
        }
        else{
            arr[++t]=data;
        }

    }

    @Override
    public E top() {
        if(isEmpty()) return null;
        return arr[t];
    }

    @Override
    public E pop() {
        if(isEmpty()) return null;
        E delete =arr[t];
        arr[t]=null;
        t--;
        return delete;
    }
    public void diplay(){
        for(int i=t;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
}
