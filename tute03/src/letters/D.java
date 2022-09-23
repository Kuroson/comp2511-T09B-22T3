package letters;

public class D {
    public static void f() {
        F f1 = new F();
        F f2 = new F();
        f1.incX();
        f2.incY();
        System.out.println(f1.getX() + " " + f1.getY());
        System.out.println(f2.getX() + " " + f2.getY());
    }

    public static void main(String[] args) {
        D.f();
    }
}
