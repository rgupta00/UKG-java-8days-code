package com.day3.session1.revision_ex;
//sr dev
class OverflowException extends RuntimeException {
    public OverflowException(String message) {
        super(message);
    }
}
class UnderflowException extends RuntimeException {
    public UnderflowException(String message) {
        super(message);
    }
}
interface Stack{
    public void push(int x);
    public int pop();
}
class StackImpRavi implements Stack{
    int x[];
    int top;
    final  int SIZE=5;
    public StackImpRavi(){
        x=new int[SIZE];
        top=-1;
    }
    @Override
    public void push(int data) {
        if(top==SIZE-1){
            new OverflowException("overflow");
            return;
        }
        x[++top]=data;
    }

    @Override
    public int pop() {
        if(top==-1){
            new UnderflowException("underflow");
        }
        return x[top--];
    }
}


public class RealLifeUseOfInterface {

    public static void main(String[] args) {

        Stack stack=new StackImpRavi();
        stack.push(2);
        stack.push(28);
        stack.push(92);
        stack.push(22);
        stack.push(772);
        stack.push(20);

        System.out.println("-----");

    }
}
