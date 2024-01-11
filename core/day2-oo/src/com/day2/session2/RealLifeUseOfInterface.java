package com.day2.session2;

//sr dev
interface Stack{
    public void push(int x);
    public int pop();
}
class StackImpRavi implements Stack{
    int x[];
    int top;
    final  int SIZE=10;
    public StackImpRavi(){
        x=new int[SIZE];
        top=-1;
    }
    @Override
    public void push(int data) {
        if(top==SIZE-1){
            System.out.println("stack if full");
            return;
        }
        x[++top]=data;
    }

    @Override
    public int pop() {
        if(top==-1){
            return -999;
        }
        return x[top--];
    }
}

class StackImpAmit implements Stack{
    int x[];
    int top;
    final  int SIZE=10;
    public StackImpAmit(){
        x=new int[SIZE];
        top=-1;
    }
    @Override
    public void push(int data) {
        if(top==SIZE-1){
            System.out.println("stack if full");
            return;
        }
        x[++top]=data;
    }

    @Override
    public int pop() {
        if(top==-1){
            return -999;
        }
        return x[top--];
    }
}
public class RealLifeUseOfInterface {

    public static void main(String[] args) {

        Stack stack=new StackImpRavi();

    }
}
