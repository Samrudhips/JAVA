class Parent{
    public void m1(){
        System.out.println("parent class m1-method");

    }
    public void m2(){
        System.out.println("parent class m2-method");

    }

}
class Child extends Parent{
    public void m3(){
        System.out.println("child class m3-method");


    }

}

public class Test {
    public static void main(String[] args) {
        Parent p1=new Parent();
        p1.m1();
        p1.m2();
        System.out.println("***************");
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
        System.out.println("***************");
        Parent p2=new Child();//Parent can hold child
        p2.m1();
        p2.m2();//we can access only parent methods
        // Child c2=new Parent();//Child cant hold parent gives an error

    }
    
}
