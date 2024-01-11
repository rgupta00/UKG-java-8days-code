package a.b;

//class :public default
//data
public class A {
    private int i = 7;
    int j = 8;
    protected int k = 7;
    public int l = 7;

    private void fooPrivate() {
        System.out.println("fooPrivate");
    }

    void fooDefault() {
        System.out.println("fooDefault");
    }

    protected void fooProtected() {
        System.out.println("fooProtected");
    }

    public void fooPublic() {
        System.out.println("fooPublic");
    }

}
