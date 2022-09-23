package letters;

public class A {
    public static void f() {
        C c = new C();
        c.speak();
        B b = c;
        b.speak();
        b = new B();
        b.speak();
        c.speak();
    }

    public static void main(String[] args) {
        A.f();
    }

}