package Stack;

public class Main {
    public static void main(String[] args) {
        SlinkedStack<Integer> lstack=new SlinkedStack<Integer>();{
            lstack.push(10);
            lstack.push(20);
            lstack.push(30);
            lstack.push(40);


            System.out.println("the top is"+lstack.top());
            while (!lstack.isEmpty()){
                System.out.println("item removed:"+lstack.pop());

            }


        }


        DSlinkedStack<Integer> lstacks=new DSlinkedStack<Integer>();{
            lstack.push(10);
            lstack.push(20);
            lstack.push(30);
            lstack.push(40);


            System.out.println("the top is"+lstacks.top());
            while (!lstack.isEmpty()){
                System.out.println("item removed:"+lstacks.pop());

            }}


        ArrayStack<Integer> lstackm=new ArrayStack<Integer>();{
            lstack.push(10);
            lstack.push(20);
            lstack.push(30);
            lstack.push(40);


            System.out.println("the top is"+lstacks.top());
            while (!lstack.isEmpty()){
                System.out.println("item removed:"+lstacks.pop());

            }}


    }
}
