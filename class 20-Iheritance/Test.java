//Multilevel Inheritance
class GP extends Object{
    public void m1(){
        System.out.println("m1 Method");
    }
}
class Parent extends GP{
    public void m2(){
        System.out.println("m2 Method");
    }
}
class Child extends Parent{
    public void m3(){
        System.out.println("m3 Method");
    }
}
public class Test {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.m1();
        c1.m2();
        c1.m3();
        
    }
   



    
}
