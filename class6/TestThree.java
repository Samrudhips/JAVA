public class TestThree {
    public static void m1(){
        int a;
        a=100;
        System.out.println(a);
    }
    public static void m2(){
        int b;
        b=200;
        // System.out.println(a+b);gives error,
        // local variables can be accessed within that method only(a cant be accessed )
    }
    
    public static void main(String[] args) {
        m1();
        m2();
        
    }
    
}
