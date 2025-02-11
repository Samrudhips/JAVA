package pack1;

public class B {
    public static void main(String[] args) {
        A a1 =new A();
        a1.m1();//public method
        // a1.m2();//private method
        a1.m3();//protected method we can acccess within same package pack1
        a1.m4();//default can access within same package
    }
    
}
