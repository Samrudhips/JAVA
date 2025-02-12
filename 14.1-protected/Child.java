package pack2;
import pack1.Parent;

public class Child extends Parent {
    public void m4() {
        System.out.println("Child class m4-method");
    } 

    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.m1(); // Works, since m1() is public
        // p1.m3(); // ERROR: Cannot access protected method through parent reference

        Child c1 = new Child();
        c1.m4(); // Works
        c1.m1(); // Works (inherited from Parent)
        c1.m3(); // Works because m3() is protected and accessed via inheritance
    }
}
