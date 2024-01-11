package a.b.c;

class Cal{
     long add(int a, long b){
        return a+b;
    }
    long add(long a, int b){
            return a+b;
     }
}
public class Overloading {
    public static void main(String[] args) {
        Cal cal = new Cal();
        System.out.println(cal.add(6,7L));
    }
}
