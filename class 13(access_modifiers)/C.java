package pack2;
import pack1.A;
//inheritance concept
class C extends A {
    public static void main(String[] args) {
        C c1=new C();
        c1.m1();//public method
        c1.m3();//protected method
        // c1.m2();//we cant access because its private
        // c1.m4();//we cant access default also
        
    }
   
    
}
